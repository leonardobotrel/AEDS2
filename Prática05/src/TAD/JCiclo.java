package TAD;

public class JCiclo {

    public static final byte branco = 0;
    public static byte cinza = 1;
    public static byte preto = 2;
    private int d[] , t [] , antecessor[];
    private JGrafo grafo;
    private boolean retorno = false;

    //Construtor, inicializa os atributos
    public JCiclo (JGrafo grafo) {
        this.grafo = grafo; //inicializa o grafo
        int n = this.grafo.getNumVertices();//número de vertices

        d = new int[n];
        t = new int[n];
        antecessor = new int[n];
    }

    private int visitaDfs ( int u, int tempo, int cor[]) {
        cor[u] = cinza;//O vertice u acabou de ser descoberto
        this.d[u] = ++tempo;

        //Explora a aresta(u,v)
        if (!this.grafo.listaAdjVazia (u)) {
            JGrafo.Aresta a = this.grafo.primeiroListaAdj (u);

            while (a != null) {
                int v = a.getV2 ();
                //Caso o vértice seja, a aresta (u,v) para esse vertice é uma aresta
                //de árvore e portando não indica se o grafo tem ciclo.
                if (cor[v] == branco) {
                    this.antecessor[v] = u;
                    tempo = this.visitaDfs (v, tempo, cor);
                }
                //caso contrario, se o vertice tiver cor cinza, entao a aresta(u,v)
                //para esse vértice é de retorno, portanto esse grafo obrigatoriamente
                //tem ciclo, e a condição de existencia de aresta de retorno de torna
                //verdadeira
                else if (cor[v] == cinza){
                    this.retorno = true;
                }

                a = this.grafo.proxAdj (u);
            }
        }

        cor[u] = preto;
        this. t [u] = ++tempo;
        return tempo;
    }

    //Realiza a busca em profundidade
    public void buscaEmProfundidade () {
        int tempo = 0; //Cria e inicializa o tempo
        int cor[] = new int[this.grafo.getNumVertices ()];//Cria e inicializa o vetor de cores

        for (int u = 0; u < grafo.getNumVertices (); u++) {
            cor[u] = branco;//Atribui a cor branca aos vertices
            this.antecessor[u] = -1;//Inicializa o antecessor com -1
        }

        for (int u = 0; u < grafo.getNumVertices (); u++)
            if (cor[u] == branco)
                tempo = this.visitaDfs (u, tempo, cor);
    }

    public int d (int v) {
        return this.d[v];
    }

    public int t (int v) {
        return this. t [v];
    }

    public int antecessor ( int v) {
        return this.antecessor[v];
    }

    //Verifica se o grafo possui ciclo
    public boolean temCiclo () {
        this.buscaEmProfundidade();
        return this.retorno;
    }

}
