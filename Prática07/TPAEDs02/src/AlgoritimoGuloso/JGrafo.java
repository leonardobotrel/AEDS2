package AlgoritimoGuloso;

public class JGrafo {

    public static class Aresta {
        private int v1, v2, linha, tempo;//Classe  Aresta com os atributos v1, v2 e peso
        //Construtor para inicializar os atributos
        public Aresta (int v1, int v2, int linha, int tempo) {
            this.linha = linha;
            this.tempo = tempo;
            this.v1 = v1;
            this.v2 = v2;
        }

        //Métodos para obter o valor dos atributos
        public int getLinha () {
            return this.linha;
        }
        public int getTempo () {
            return this.tempo;
        }
        public int getV1 () {
            return v1;
        }
        public int getV2 () {
            return v2;
        }
    }

    private int mat[][][];// Pesos das arestas
    private int numVertices;// Atributo indicando o número de vértices
    private int pos[];//Posição atual ao se percorrer  os adjs de um vértice v

    //Construtor para inicializar os atributos
    public JGrafo (int numVertices) {
        //Instancialização de mat[][] e pos[]
        this.mat = new int[numVertices][numVertices][2];
        this.pos = new int [numVertices];
        this.numVertices = numVertices;

        // Inicialização de mat[][] e pos[]
        for (int i = 0; i < this.numVertices; i++) {
            for (int j = 0; j < this.numVertices; j++) {
                this.mat[i][j][0] = 0;//Linha
                this.mat[i][j][1] = 0;//Tempo
            }
            this.pos[i] = -1;
        }
    }

    //Inserção de uma nova aresta em mat[][]
    public void insereAresta (int v1, int v2, int linha, int tempo) {
        this.mat[v1][v2][0] = linha;
        this.mat[v1][v2][1] = tempo;
    }

    //Verifica se existe uma aresta cujas incidências são passadas por parâmetro
    public boolean existeAresta (int v1, int v2) {
        return (this.mat[v1][v2][0] > 0 || this.mat[v1][v2][1] > 0);
    }

    // Retorna o primeiro objeto Aresta em que o parâmetro v participa
    public Aresta primeiroListaAdj (int v) {
        //Retorna a primeira aresta que o vértice v participa ou
        //null se a lista de adjacência de v for vazia
        this.pos[v] = -1;
        return this.proxAdj (v);// inicializa o percurso das adjacências de v
    }

    public Aresta proxAdj (int v) {
        //Retorna a próxima aresta que o vértice v participa ou
        //null se a lista de adjacência de v estiver no fim

        this.pos[v]++;//Posiciona p[] na próxima aresta a ser pesquisada

        //Verifica de p[v] é uma adjacência válida e Se a adjacência existe. Se não existir verifica a próxima adjacência
        while ((this.pos[v] < this.numVertices) && (this.mat[v][this.pos[v]][0] == 0) && this.mat[v][this.pos[v]][1] == 0)
            this.pos[v]++;

        if (this.pos[v] == this.numVertices)//Se a adjacência for inválida retorna null
            return null;
        else// Caso contrário retorna um objeto Aresta com a aresta procurada
            return new Aresta(v, this.pos[v], this.mat[v][this.pos[v]][0], this.mat[v][this.pos[v]][1]);
    }

    public Aresta retiraAresta (int v1, int v2) {
        if (this.mat[v1][v2][0] == 0 && this.mat[v1][v2][1] == 0)//Aresta não existe
            return null;
        else {
            Aresta aresta = new Aresta(v1, v2, this.mat[v1][v2][0], this.mat[v1][v2][1]);
            this.mat[v1][v2][0] = 0;
            this.mat[v1][v2][1] = 0;
            return aresta;
        }
    }

    public void imprime () {
        System.out.print("  ");

        for (int i = 0; i < this.numVertices; i++)
            System.out.print(i + "  ");
        System.out.println();

        for (int i = 0; i < this.numVertices; i++) {
            System.out.print(i  + "  ");

            for (int j = 0; j < this.numVertices; j++)
                System.out.print("Linha" + this.mat[i][j][0] + "Tempo: " + this.mat[i][j][1] + "  ");
            System.out.println();
        }
    }

    public int getNumVertices (){
        return this.numVertices;
    }

    public boolean listaAdjVazia (int u) {
        int n = 0;
        for (int i = 0; i < this.numVertices; i++) {
            n += this.mat[u][i][0];
            n += this.mat[u][i][1];
        }

        if (n == 0) {
            return true;
        }
        else
            return false;
    }

}

