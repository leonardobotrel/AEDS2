import AlgoritimoGuloso.JAEDsMaps;
import AlgoritimoGuloso.JGrafo;

public class LinhaDeMontagem {

    public static void main(String[] args) throws Exception {

        //Programação dinamica
        ProgramacaoDinamica temp = new ProgramacaoDinamica();

        for (int j=1;j < 6; j++){

            temp.fastest_way(j);

        }

        System.out.println("Programação dinamica:");

        temp.result();

        System.out.println("\n\n");

        //Algoritimo guloso

        JGrafo grafo = new JGrafo(5);

        //Chama a função para inserir elementos no primeiro grafo
        grafo.insereAresta(0, 0, 1, 2);
        grafo.insereAresta(0, 1, 2, 3);
        grafo.insereAresta(0, 2, 1, 10);
        grafo.insereAresta(0, 3, 2, 2);
        grafo.insereAresta(0, 4, 1, 5);
        grafo.insereAresta(1, 0, 2, 7);
        grafo.insereAresta(1, 1, 1, 8);
        grafo.insereAresta(1, 2, 2, 0);
        grafo.insereAresta(1, 3, 1, 2);
        grafo.insereAresta(1, 4, 2, 5);
        grafo.insereAresta(2, 0, 1, 1);
        grafo.insereAresta(2, 1, 2, 0);
        grafo.insereAresta(2, 2, 1, 6);
        grafo.insereAresta(2, 3, 2, 4);
        grafo.insereAresta(2, 4, 1, 2);
        grafo.insereAresta(3, 0, 2, 3);
        grafo.insereAresta(3, 1, 1, 8);
        grafo.insereAresta(3, 2, 2, 7);
        grafo.insereAresta(3, 3, 1, 0);
        grafo.insereAresta(3, 4, 2, 7);
        grafo.insereAresta(4, 0, 1, 0);
        grafo.insereAresta(4, 1, 2, 0);
        grafo.insereAresta(4, 2, 1, 0);
        grafo.insereAresta(4, 3, 2, 0);
        grafo.insereAresta(4, 4, 1, 0);

        //Gera o menor caminho
        JAEDsMaps aed = new JAEDsMaps(grafo);
        aed.obterArvoreCMC(0);

        //Imprime o caminho  mais curto
        System.out.println("Algoritmo guloso:");
        aed.imprime(0, 4);

    }

}
