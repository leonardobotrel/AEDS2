package Heap;
import Item.Item;

public class JHeap {

    private Item v[];
    private int n;
    public static int comp;

    public JHeap (Item v[]) {
        this.v = v;
        this.n = this.v.length - 1;
    }

    //Retorna o  item com maior chave.
    public Item max () {
        return this.v[1];
    }

    //Metodo para refazer o heap. Ajusta a posição esq do heap passada por parâmetro. O parâmetro corresponde a última posição do vetor.
    public void refaz ( int esq, int dir ) {
        //j é seu filho à esquerda mo heap.
        int j = esq * 2;
        Item x = this.v[esq];

        while ( j <= dir ) {
            comp++;
            if (( j < dir) && (this.v[ j ].compara (this.v[ j + 1]) < 0)) //Verifica se é uma posição válida e qual dos filhos de j é menor (esq ou dir). J se refere ao maior elemento.
                j++;
            comp += 2;

            if (x.compara (this.v[ j ]) >= 0) //Verifica se o valor na posição x é maior que seu filho no heap j.
                break;
            comp++;

            this.v[esq] = this.v[ j ]; // Se não for maior a troca é realizada.
            esq = j;
            j = esq * 2;
        }

        comp++;
        this.v[esq] = x;
    }

    //Metodo para construir o heap.
    public void constroi() {
        int esq = n / 2 + 1;

        while (esq > 1) { //O método refaz é invocado até o primeiro elemento.
            comp++;
            esq--;
            this.refaz(esq, this.n);
        }
        comp++;
    }

    //Retira o item com maior chave.
    public Item retiraMax () throws Exception {
        Item maximo;

        if (this.n < 1) throw new Exception ( "Erro: heap vazio" ); //Verifica se existe um elemento váido para ser retirado.
        else {
            maximo = this.v[1]; //Existindo a variável maximo recebe v[1]
            this.v[1] = this.v[this.n--]; //E v[1] recebe o último elemento.
            refaz (1 , this.n); //A última posição é decrementada e o método refaz é chamado.
        }

        return maximo;
    }

    //Aumenta o valor da chave do item i.
    public void aumentaChave ( int i , Object chaveNova) throws Exception {
        Item x = this.v[ i ];

        if (chaveNova == null) throw new Exception ( "Erro: chaveNova com valor null" ); //Verifica se a chave é válida.

        x.alteraChave (chaveNova); // Se for faz a alteração.

        while (( i > 1) && (x.compara (this.v[ i / 2]) >= 0)) { //Verifica se a nova chave é maior que seu pai no heap - necessita de ajuste.
            //Se for faz a troca.
            this.v[ i ] = this.v[ i / 2];
            i /= 2;
        }

        this.v[ i ] = x;
    }

    //Insere um novo item no heap.
    public void insere (Item x) throws Exception {
        this.n++;

        if (this.n == this.v.length) throw new Exception ("Erro: heap cheio" );

        Object chaveNova = x.recuperaChave ();
        this.v[this.n] = x;
        this.v[this.n].alteraChave (new Integer (Integer.MIN_VALUE)); //−∞
        this.aumentaChave (this.n, chaveNova);
    }

}
