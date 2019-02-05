import TAD.JAEDsMaps;
import TAD.JGrafo;

public class main {

    public static void main (String[] args) throws Exception {
        //Primeiro Grafo
        JGrafo grafo = new JGrafo(5); //Cria um grafo de 5 vertices

        //Chama a função para inserir elementos no primeiro grafo
        grafo.insereAresta(0, 0, 0, 0);
        grafo.insereAresta(0, 1, 8, 3);
        grafo.insereAresta(0, 2, 4, 10);
        grafo.insereAresta(0, 3, 5, 2);
        grafo.insereAresta(0, 4, 0, 0);
        grafo.insereAresta(1, 0, 0, 0);
        grafo.insereAresta(1, 1, 0, 0);
        grafo.insereAresta(1, 2, 0, 0);
        grafo.insereAresta(1, 3, 0, 0);
        grafo.insereAresta(1, 4, 9, 5);
        grafo.insereAresta(2, 0, 0, 0);
        grafo.insereAresta(2, 1, 0, 0);
        grafo.insereAresta(2, 2, 0, 0);
        grafo.insereAresta(2, 3, 1, 4);
        grafo.insereAresta(2, 4, 5, 2);
        grafo.insereAresta(3, 0, 0, 0);
        grafo.insereAresta(3, 1, 3, 8);
        grafo.insereAresta(3, 2, 5, 7);
        grafo.insereAresta(3, 3, 0, 0);
        grafo.insereAresta(3, 4, 2, 7);
        grafo.insereAresta(4, 0, 0, 0);
        grafo.insereAresta(4, 1, 0, 0);
        grafo.insereAresta(4, 2, 0, 0);
        grafo.insereAresta(4, 3, 0, 0);
        grafo.insereAresta(4, 4, 0, 0);

        //Gera o menor caminho
        JAEDsMaps aed = new JAEDsMaps(grafo);
        aed.obterArvoreCMC(0);

        //Imprime o caminho  mais curto
        System.out.println("Primeiro grafo:");
        aed.imprimeCaminho(0, 4);

        //Segundo Grafo
        JGrafo grafo2 = new JGrafo(5); //Cria um grafo de 5 vertices

        //Chama a função para inserir elementos no segundo grafo
        //0 = a, 1 = b, 2 = c, 3 = d, 4 = e.
        grafo2.insereAresta(0, 0, 0, 0);
        grafo2.insereAresta(0, 1, 3, 3);
        grafo2.insereAresta(0, 2, 0, 0);
        grafo2.insereAresta(0, 3, 5, 5);
        grafo2.insereAresta(0, 4, 0, 0);

        grafo2.insereAresta(1, 0, 0, 0);
        grafo2.insereAresta(1, 1, 0, 0);
        grafo2.insereAresta(1, 2, 2, 6);
        grafo2.insereAresta(1, 3, 2, 2);
        grafo2.insereAresta(1, 4, 0, 0);

        grafo2.insereAresta(2, 0, 0, 0);
        grafo2.insereAresta(2, 1, 0, 0);
        grafo2.insereAresta(2, 2, 0, 0);
        grafo2.insereAresta(2, 3, 0, 0);
        grafo2.insereAresta(2, 4, 2, 2);

        grafo2.insereAresta(3, 0, 0, 0);
        grafo2.insereAresta(3, 1, 3, 1);
        grafo2.insereAresta(3, 2, 5, 4);
        grafo2.insereAresta(3, 3, 0, 0);
        grafo2.insereAresta(3, 4, 9, 6);

        grafo2.insereAresta(4, 0, 6, 3);
        grafo2.insereAresta(4, 1, 0, 0);
        grafo2.insereAresta(4, 2, 4, 7);
        grafo2.insereAresta(4, 3, 0, 0);
        grafo2.insereAresta(4, 4, 0, 0);

        //Gera o menor caminho
        JAEDsMaps aed2 = new JAEDsMaps(grafo2);
        aed2.obterArvoreCMC(3);

        //Imprime o caminho  mais curto
        System.out.println("Segundo grafo:");
        aed2.imprimeCaminho(3, 0);
    }
}
