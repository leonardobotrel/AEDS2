package TAD;

public class JAGM {

    private int antecessor[];//Vetor de antecessores
    private double p[];//vetor de pesos
    private JGrafo grafo;//grafo


    public JAGM (JGrafo grafo) {
        this.grafo = grafo;//Inicializa o grafo
    }


    public void obterAgm ( int raiz ) throws Exception {
        int n = this.grafo.getNumVertices();
        this.p = new double[n]; // peso dos vértices
        int vs[] = new int[n+1]; // vértices

        boolean itensHeap[] = new boolean[n];
        this.antecessor = new int[n];

        for (int u = 0; u < n; u ++) {
            this.antecessor[u] = -1;//Inicializa os antecessores com -1
            p[u] = Double.MAX_VALUE; // Inicia p[u] como ∞
            vs[u+1] = u; // Heap indireto a ser construído
            itensHeap[u] = true;
        }

        p[raiz] = 0;
        FPHeapMinIndireto heap = new FPHeapMinIndireto (p, vs);
        heap.constroi ();


        while (!heap.vazio ()) {//Enqunto o heap não for vazio
            int u = heap.retiraMin ();//Extrai o Q minimo
            itensHeap[u] = false;

            if (!this.grafo.listaAdjVazia (u)) {
                JGrafo.Aresta adj = grafo.primeiroListaAdj (u);//adj recebe o primeiro da lista de adjacencia

                while (adj != null) {
                    int v = adj.getV2();

                    if (itensHeap[v] && (adj.getPeso() < this.peso (v))) {//se v pertence a Q e peso for menor que este peso
                        antecessor[v] = u;//O antecessor recebe u
                        heap.diminuiChave (v, adj.getPeso ());
                    }
                    adj = grafo.proxAdj (u);
                }
            }
        }
    }

    //Permite ao usuario da classe obter o antecessor de um certo vértice
    public int antecessor ( int u) {
        return this.antecessor[u];
    }

    //Permite ao usuario da classe obter o peso associado a um vértice
    public double peso (int u) {
        return this.p[u];
    }

    //Permite ao usuario da classe imprimir as arestas da árvore, respectivamente
    public void imprime () {
        for (int u = 0; u < this.p.length; u++)
            if (this.antecessor[u] != -1)
                System.out. println ( "(" +antecessor[u]+ " ," +u+ ") −− p:" + peso (u));
    }

    public double pesoAGM () {
        double pesoAGM = 0;
        for (int u = 0; u < this.p.length; u++) {
            pesoAGM += this.peso(u);
        }

        return pesoAGM;
    }

}
