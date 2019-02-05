package ArvoreB;

import Item.Item;

public class ArvoreB {

    //Pagina.
    private static class Pagina {

        int n; //Numeros de itens na página.
        Item r[]; //Vetor contendo os registros da página de tamanho 2m
        Pagina p[]; //Vetor de objetos para as paginas a um nível abaixo de tamanho 2m+1

        //Construtor
        public Pagina (int mm) {
            this.n = 0;
            this.r = new Item[mm];
            this.p = new Pagina[mm + 1];
        }

    }

    private Pagina raiz; //Raiz da árvore.
    private int m, mm; //Quantidade mínima e máxima em cada página

    //Construtor
    public ArvoreB (int m) {
        this.raiz = null;
        this.m = m;
        this.mm = 2*m;
    }

    public Item pesquisa (Item reg){
        int comparacoes = 0;
        return this.pesquisa(reg, this.raiz, comparacoes);
    }

    public void insere (Item reg) {

        Item regRetorno[] = new Item[1]; //Indica o Item que vai ser inserido, obtido do método insere
        boolean cresceu[] = new boolean[1]; //Informa que um registro “subiu” proveniente de uma inserção
        Pagina apRetorno = this.insere (reg, this.raiz, regRetorno, cresceu);

        if (cresceu[0]) { //É verificado se houve crescimento ou não da raiz
            //Uma nova Pagina é criada e atribuída à raiz. Vai ocorrern a última chamada recursiva, quando o deslocamento chega à raiz
            Pagina apTemp = new Pagina (this.mm);
            apTemp.r[0] = regRetorno[0];
            apTemp.p[0] = this.raiz;
            apTemp.p[1] = apRetorno;
            this.raiz = apTemp;
            this.raiz.n++;
        }
        else this.raiz = apRetorno;

    }

    private Item pesquisa (Item reg, Pagina ap, int comparacoes) {

        //Registro não encontrado
        if (ap == null) {
            System.out.println("Registro não encontrado.");
            System.out.println("Número de comparações: " + comparacoes);
            return null;
        }

        else {
            int i = 0;

            while ((i < ap.n - 1) && (reg.compara(ap.r[i]) > 0)) { //Verifica se a posição atual(i) é válida e se o registro procurado é maior que o atual→incrementa a posição
                comparacoes++;
                i++;
            }

            //Retorna elemento encontrado.
            if (reg.compara(ap.r[i]) == 0) {
                comparacoes++;
                ap.r[i].setNumComparacoes(comparacoes);
                return ap.r[i];
            }

                //Pesquisa no filho a esquerda.
            else if (reg.compara(ap.r[i]) < 0) {
                comparacoes++;
                return pesquisa(reg, ap.p[i], comparacoes);
            }

                //Pesquisa no filho a direita.
            else
                return pesquisa(reg, ap.p[i + 1], comparacoes);

        }

    }

    private Pagina insere (Item reg, Pagina ap, Item[] regRetorno, boolean[] cresceu) {

        Pagina apRetorno = null;

        if (ap == null) { //Caso ap = null→ a Pagina onde o registro deve ser inserido foi encontrado
            //As variáveis cresceu[0] e regRetorno são atualizadas
            cresceu[0] = true;
            regRetorno[0] = reg;
        }
        else {
            int i = 0;

            while ((i < ap.n-1) && (reg.compara(ap.r[i]) > 0)) //A partir da esquerda, i é posicionado no primeiro elemento que seja maior ou igual ao registro a ser inserido – como em pesquisa
                i++;

            if (reg.compara(ap.r[i]) == 0) {
                System.out.println ("Erro: registro já existente");
                cresceu[0] = false;
            }
            else {
                if (reg.compara(ap.r[i]) > 0) //Verifica se a próxima página a ser pesquisada deve ser a da direita ou a da esquerda
                    i++;

                apRetorno = insere (reg, ap.p[i], regRetorno, cresceu);

                if (cresceu[0])
                    if (ap.n < this.mm) { // Página tem espaço.
                    this.insereNaPagina (ap, regRetorno[0], apRetorno);
                    cresceu[0] = false;
                    apRetorno = ap;
                    }
                    else { // Overflow: Página tem que ser dividida
                        //É criada uma nova Pagina apTemp
                        Pagina apTemp = new Pagina(this.mm);
                        apTemp.p[0] = null;

                        if (i <= this.m) { //Verifica se o novo registro deve ficar na nova Pagina apTemp ou na Pagina atual ap.
                            this.insereNaPagina (apTemp, ap.r[this.mm-1], ap.p[this.mm]);
                            ap.n--;
                            this.insereNaPagina(ap, regRetorno[0], apRetorno);
                        }
                        else
                            this.insereNaPagina (apTemp, regRetorno[0], apRetorno);

                        for (int j = this.m+1; j < this.mm; j++) {
                            this.insereNaPagina (apTemp, ap.r[j], ap.p[j+1]); // Transfere a metade direita da Pagina atual ap para a nova Pagina apTemp
                            ap.p[j+1] = null; //Transfere a posse da memória.
                        }
                        ap.n = this.m;
                        apTemp.p[0] = ap.p[this.m+1];
                        regRetorno[0] = ap.r[this.m]; //Atribui o registro do meio à regRetorno → vai subir na árvore
                        apRetorno = apTemp; //Atribui o objeto apTemp à apRetorno → para ser referenciado pelo novo ponteiro da Pagina“superior”.
                    }
            }
        }
        return (cresceu[0] ? apRetorno : ap);

    }

    //Método auxiliar para inserção do Item reg na Pagina ap.
    private void insereNaPagina (Pagina ap, Item reg, Pagina apDir) {

        int k = ap.n-1; // Posição valida mais a direita.

        //Desloca-se os elementos de r e p para a direita até que a posição correta de inserção seja encontrada
        while ((k >= 0) && (reg.compara(ap.r[k]) < 0)) {
            ap.r[k+1] = ap.r[k];
            ap.p[k+2] = ap.p[k+1];
            k--;
        }
        //reg e apDir são inseridos na página corrente;
        ap.r[k+1] = reg;
        ap.p[k+2] = apDir;
        ap.n++;
    }

}
