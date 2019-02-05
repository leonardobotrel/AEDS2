package ArvoreBinaria;
import Item.Item;

public class ArvoreBinaria {
    private static class No{
        Item reg;
        No esq, dir;
    }

    private No raiz;

    //Atribui null para a raíz da árvore.
    public ArvoreBinaria(){
        this.raiz = null;
    }

    //Recebe um objeto do tipo Item, e chama a função pesquisa.
    public Item pesquisa(Item reg){
        int comparacoes = 0;
        return this.pesquisa(reg, this.raiz, comparacoes);
    }

    //Recebe um objeto do tipo Item, e chama a função insere.
    public void insere(Item reg){
        this.raiz = this.insere(reg, this.raiz);
    }

    //Recebe um objeto do tipo Item, e chama a função retira.
    public void retira(Item reg){
        this.raiz = this.retira(reg, this.raiz);
    }

    //Pesquisa na árvore pelo registro recebido como parametro, retorna o Item correspondente caso a busca seja bem sucedida ou null caso contrário.
    private Item pesquisa(Item reg, No p, int comparacoes){
        //Verifica se o No é null
        if(p == null) {
            System.out.println("Registro não encontrado.");
            System.out.println("Número de comparações: " + comparacoes);
            return null;
        }

        //Compara o registro recebido com o do No, e caso seja menor chama o filho a esquerda.
        else if(reg.compara(p.reg) < 0) {
            comparacoes++;
            return pesquisa(reg, p.esq, comparacoes);
        }

        //Compara o registro recebido com o do No, e caso seja maior chama o filho a direita.
        else if(reg.compara(p.reg) > 0) {
            comparacoes++;
            return pesquisa(reg, p.dir, comparacoes);
        }

        //Retorna o registro encontrado.
        else {
            p.reg.setNumComparacoes(comparacoes);
            return p.reg;
        }
    }

    //Caminha pela árvore até encontrar o lugar correto de inserir o item.
    private No insere(Item reg, No p){
        //Verifica se o No é null, se for null cria um novo No e insere o registro.
        if(p==null){
            p = new No();
            p.reg = reg;
            p.esq = null; p.dir = null;
        }

        //Compara o registro recebido com o do No, e caso seja menor chama o filho a esquerda.
        else if(reg.compara(p.reg) < 0) {
            p.esq = insere(reg, p.esq);
        }

        //Compara o registro recebido com o do No, e caso seja maior chama o filho a direita.
        else if(reg.compara(p.reg) > 0) {
            p.dir = insere(reg, p.dir);
        }

        //Avisa que o registro já está na a árvore.
        else
            System.out.println("Erro: Já existe este registro");
        return p;
    }

    //Auxilia a função retira, é chamada se o No que estiver sendo retirado possuir dois decententes.
    private No antecessor(No q, No r){
        if(r.dir != null)
            r.dir = antecessor(q, r.dir);
        else{
            q.reg = r.reg;
            r = r.esq;
        }
        return r;
    }

    //Caminha pela árvore até encontrar o Item a ser retirado e o retira da árvore. Caso o Item não esteja na árvore avisa que o Item não foi emcontrado.
    private No retira(Item reg, No p){
        //Avisa que o registro não foi encontrado.
        if(p == null)
            System.out.println("Erro: registro não encontrado");

        //Compara o registro recebido com o do No, e caso seja menor chama o filho a esquerda.
        else if(reg.compara(p.reg) < 0)
            p.esq = retira(reg, p.esq);

        //Compara o registro recebido com o do No, e caso seja maior chama o filho a direita.
        else if(reg.compara(p.reg) > 0)
            p.dir = retira(reg, p.dir);

        //Remove o No da árvore.
        else{
            if(p.dir == null)
                p = p.esq;
            else if(p.esq == null)
                p = p.dir;
            else
                p.esq = antecessor(p, p.esq);
        }
        return p;
    }
}
