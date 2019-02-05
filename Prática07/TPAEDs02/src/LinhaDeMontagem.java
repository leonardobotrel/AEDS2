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

        JGrafo grafo = new JGrafo(16);

        //Chama a função para inserir elementos no primeiro grafo
        grafo.insereAresta(0, 0, 0, 0);
        grafo.insereAresta(0, 1, 1, 2);
        grafo.insereAresta(0, 2, 0, 0);
        grafo.insereAresta(0, 3, 0, 0);
        grafo.insereAresta(0, 4, 0, 0);
        grafo.insereAresta(0, 5, 0, 0);
        grafo.insereAresta(0, 6, 0, 0);
        grafo.insereAresta(0, 7, 0, 0);
        grafo.insereAresta(0, 8, 0, 0);
        grafo.insereAresta(0, 9, 2, 4);
        grafo.insereAresta(0, 10, 0, 0);
        grafo.insereAresta(0, 11, 0, 0);
        grafo.insereAresta(0, 12, 0, 0);
        grafo.insereAresta(0, 13, 0, 0);
        grafo.insereAresta(0, 14, 0, 0);
        grafo.insereAresta(0, 15, 0, 0);
        grafo.insereAresta(1, 0, 0, 0);
        grafo.insereAresta(1, 1, 0, 0);
        grafo.insereAresta(1, 2, 1, 7);
        grafo.insereAresta(1, 3, 0, 0);
        grafo.insereAresta(1, 4, 0, 0);
        grafo.insereAresta(1, 5, 0, 0);
        grafo.insereAresta(1, 6, 0, 0);
        grafo.insereAresta(1, 7, 0, 0);
        grafo.insereAresta(1, 8, 0, 0);
        grafo.insereAresta(1, 9, 0, 0);
        grafo.insereAresta(1, 10, 0, 0);
        grafo.insereAresta(1, 11, 0, 0);
        grafo.insereAresta(1, 12, 0, 0);
        grafo.insereAresta(1, 13, 0, 0);
        grafo.insereAresta(1, 14, 0, 0);
        grafo.insereAresta(1, 15, 0, 0);
        grafo.insereAresta(2, 0, 0, 0);
        grafo.insereAresta(2, 1, 0, 0);
        grafo.insereAresta(2, 2, 0, 0);
        grafo.insereAresta(2, 3, 1, 9);
        grafo.insereAresta(2, 4, 0, 0);
        grafo.insereAresta(2, 5, 0, 0);
        grafo.insereAresta(2, 6, 0, 0);
        grafo.insereAresta(2, 7, 0, 0);
        grafo.insereAresta(2, 8, 0, 0);
        grafo.insereAresta(2, 9, 0, 0);
        grafo.insereAresta(2, 10, 2, 2);
        grafo.insereAresta(2, 11, 0, 0);
        grafo.insereAresta(2, 12, 0, 0);
        grafo.insereAresta(2, 13, 0, 0);
        grafo.insereAresta(2, 14, 0, 0);
        grafo.insereAresta(2, 14, 0, 0);
        grafo.insereAresta(2, 15, 0, 0);
        grafo.insereAresta(3, 0, 0, 0);
        grafo.insereAresta(3, 1, 0, 0);
        grafo.insereAresta(3, 2, 0, 0);
        grafo.insereAresta(3, 3, 0, 0);
        grafo.insereAresta(3, 4, 1, 3);
        grafo.insereAresta(3, 5, 0, 0);
        grafo.insereAresta(3, 6, 0, 0);
        grafo.insereAresta(3, 7, 0, 0);
        grafo.insereAresta(3, 8, 0, 0);
        grafo.insereAresta(3, 9, 0, 0);
        grafo.insereAresta(3, 10, 0, 0);
        grafo.insereAresta(3, 11, 2, 3);
        grafo.insereAresta(3, 12, 0, 0);
        grafo.insereAresta(3, 13, 0, 0);
        grafo.insereAresta(3, 14, 0, 0);
        grafo.insereAresta(3, 15, 0, 0);
        grafo.insereAresta(4, 0, 0, 0);
        grafo.insereAresta(4, 1, 0, 0);
        grafo.insereAresta(4, 2, 0, 0);
        grafo.insereAresta(4, 3, 0, 0);
        grafo.insereAresta(4, 4, 0, 0);
        grafo.insereAresta(4, 5, 1, 4);
        grafo.insereAresta(4, 6, 0, 0);
        grafo.insereAresta(4, 7, 0, 0);
        grafo.insereAresta(4, 8, 0, 0);
        grafo.insereAresta(4, 9, 0, 0);
        grafo.insereAresta(4, 10, 0, 0);
        grafo.insereAresta(4, 11, 0, 0);
        grafo.insereAresta(4, 12, 2, 1);
        grafo.insereAresta(4, 13, 0, 0);
        grafo.insereAresta(4, 14, 0, 0);
        grafo.insereAresta(4, 15, 0, 0);
        grafo.insereAresta(5, 0, 0, 0);
        grafo.insereAresta(5, 1, 0, 0);
        grafo.insereAresta(5, 2, 0, 0);
        grafo.insereAresta(5, 3, 0, 0);
        grafo.insereAresta(5, 4, 0, 0);
        grafo.insereAresta(5, 5, 0, 0);
        grafo.insereAresta(5, 6, 1, 8);
        grafo.insereAresta(5, 7, 0, 0);
        grafo.insereAresta(5, 8, 0, 0);
        grafo.insereAresta(5, 9, 0, 0);
        grafo.insereAresta(5, 10, 0, 0);
        grafo.insereAresta(5, 11, 0, 0);
        grafo.insereAresta(5, 12, 0, 0);
        grafo.insereAresta(5, 13, 2, 3);
        grafo.insereAresta(5, 14, 0, 0);
        grafo.insereAresta(5, 15, 0, 0);
        grafo.insereAresta(6, 0, 0, 0);
        grafo.insereAresta(6, 1, 0, 0);
        grafo.insereAresta(6, 2, 0, 0);
        grafo.insereAresta(6, 3, 0, 0);
        grafo.insereAresta(6, 4, 0, 0);
        grafo.insereAresta(6, 5, 0, 0);
        grafo.insereAresta(6, 6, 0, 0);
        grafo.insereAresta(6, 7, 0, 4);
        grafo.insereAresta(6, 8, 0, 0);
        grafo.insereAresta(6, 9, 0, 0);
        grafo.insereAresta(6, 10, 0, 0);
        grafo.insereAresta(6, 11, 0, 0);
        grafo.insereAresta(6, 12, 0, 0);
        grafo.insereAresta(6, 13, 0, 0);
        grafo.insereAresta(6, 14, 2, 4);
        grafo.insereAresta(6, 15, 0, 0);
        grafo.insereAresta(7, 0, 0, 0);
        grafo.insereAresta(7, 1, 0, 0);
        grafo.insereAresta(7, 2, 0, 0);
        grafo.insereAresta(7, 3, 0, 0);
        grafo.insereAresta(7, 4, 0, 0);
        grafo.insereAresta(7, 5, 0, 0);
        grafo.insereAresta(7, 6, 0, 0);
        grafo.insereAresta(7, 7, 0, 0);
        grafo.insereAresta(7, 8, 0, 3);
        grafo.insereAresta(7, 9, 0, 0);
        grafo.insereAresta(7, 10, 0, 0);
        grafo.insereAresta(7, 11, 0, 0);
        grafo.insereAresta(7, 12, 0, 0);
        grafo.insereAresta(7, 13, 0, 0);
        grafo.insereAresta(7, 14, 0, 0);
        grafo.insereAresta(7, 15, 0, 0);
        grafo.insereAresta(8, 0, 0, 0);
        grafo.insereAresta(8, 1, 0, 0);
        grafo.insereAresta(8, 2, 0, 0);
        grafo.insereAresta(8, 3, 0, 0);
        grafo.insereAresta(8, 4, 0, 0);
        grafo.insereAresta(8, 5, 0, 0);
        grafo.insereAresta(8, 6, 0, 0);
        grafo.insereAresta(8, 7, 0, 0);
        grafo.insereAresta(8, 8, 0, 0);
        grafo.insereAresta(8, 9, 0, 0);
        grafo.insereAresta(8, 10, 0, 0);
        grafo.insereAresta(8, 11, 0, 0);
        grafo.insereAresta(8, 12, 0, 0);
        grafo.insereAresta(8, 13, 0, 0);
        grafo.insereAresta(8, 14, 0, 0);
        grafo.insereAresta(8, 15, 0, 0);
        grafo.insereAresta(9, 0, 0, 0);
        grafo.insereAresta(9, 1, 0, 0);
        grafo.insereAresta(9, 2, 0, 0);
        grafo.insereAresta(9, 3, 0, 0);
        grafo.insereAresta(9, 4, 0, 0);
        grafo.insereAresta(9, 5, 0, 0);
        grafo.insereAresta(9, 6, 0, 0);
        grafo.insereAresta(9, 7, 0, 0);
        grafo.insereAresta(9, 8, 0, 0);
        grafo.insereAresta(9, 9, 0, 0);
        grafo.insereAresta(9, 10, 2, 8);
        grafo.insereAresta(9, 11, 0, 0);
        grafo.insereAresta(9, 12, 0, 0);
        grafo.insereAresta(9, 13, 0, 0);
        grafo.insereAresta(9, 14, 0, 0);
        grafo.insereAresta(9, 15, 0, 0);
        grafo.insereAresta(10, 0, 0, 0);
        grafo.insereAresta(10, 1, 0, 0);
        grafo.insereAresta(10, 2, 1, 2);
        grafo.insereAresta(10, 3, 0, 0);
        grafo.insereAresta(10, 4, 0, 0);
        grafo.insereAresta(10, 5, 0, 0);
        grafo.insereAresta(10, 6, 0, 0);
        grafo.insereAresta(10, 7, 0, 0);
        grafo.insereAresta(10, 8, 0, 0);
        grafo.insereAresta(10, 9, 0, 0);
        grafo.insereAresta(10, 10, 0, 0);
        grafo.insereAresta(10, 11, 2, 5);
        grafo.insereAresta(10, 12, 0, 0);
        grafo.insereAresta(10, 13, 0, 0);
        grafo.insereAresta(10, 14, 0, 0);
        grafo.insereAresta(10, 15, 0, 0);
        grafo.insereAresta(11, 0, 0, 0);
        grafo.insereAresta(11, 1, 0, 0);
        grafo.insereAresta(11, 2, 0, 0);
        grafo.insereAresta(11, 3, 1, 1);
        grafo.insereAresta(11, 4, 0, 0);
        grafo.insereAresta(11, 5, 0, 0);
        grafo.insereAresta(11, 6, 0, 0);
        grafo.insereAresta(11, 7, 0, 0);
        grafo.insereAresta(11, 8, 0, 0);
        grafo.insereAresta(11, 9, 0, 0);
        grafo.insereAresta(11, 10, 0, 0);
        grafo.insereAresta(11, 11, 0, 0);
        grafo.insereAresta(11, 12, 2, 6);
        grafo.insereAresta(11, 13, 0, 0);
        grafo.insereAresta(11, 14, 0, 0);
        grafo.insereAresta(11, 15, 0, 0);
        grafo.insereAresta(12, 0, 0, 0);
        grafo.insereAresta(12, 1, 0, 0);
        grafo.insereAresta(12, 2, 0, 0);
        grafo.insereAresta(12, 3, 0, 0);
        grafo.insereAresta(12, 4, 1, 2);
        grafo.insereAresta(12, 5, 0, 0);
        grafo.insereAresta(12, 6, 0, 0);
        grafo.insereAresta(12, 7, 0, 0);
        grafo.insereAresta(12, 8, 0, 0);
        grafo.insereAresta(12, 9, 0, 0);
        grafo.insereAresta(12, 10, 0, 0);
        grafo.insereAresta(12, 11, 0, 0);
        grafo.insereAresta(12, 12, 0, 0);
        grafo.insereAresta(12, 13, 2, 4);
        grafo.insereAresta(12, 14, 0, 0);
        grafo.insereAresta(12, 15, 0, 0);
        grafo.insereAresta(13, 0, 0, 0);
        grafo.insereAresta(13, 1, 0, 0);
        grafo.insereAresta(13, 2, 0, 0);
        grafo.insereAresta(13, 3, 0, 0);
        grafo.insereAresta(13, 4, 0, 0);
        grafo.insereAresta(13, 5, 1, 2);
        grafo.insereAresta(13, 6, 0, 0);
        grafo.insereAresta(13, 7, 0, 0);
        grafo.insereAresta(13, 8, 0, 0);
        grafo.insereAresta(13, 9, 0, 0);
        grafo.insereAresta(13, 10, 0, 0);
        grafo.insereAresta(13, 11, 0, 0);
        grafo.insereAresta(13, 12, 0, 0);
        grafo.insereAresta(13, 13, 0, 0);
        grafo.insereAresta(13, 14, 2, 5);
        grafo.insereAresta(13, 15, 0, 0);
        grafo.insereAresta(14, 0, 0, 0);
        grafo.insereAresta(14, 1, 0, 0);
        grafo.insereAresta(14, 2, 0, 0);
        grafo.insereAresta(14, 3, 0, 0);
        grafo.insereAresta(14, 4, 0, 0);
        grafo.insereAresta(14, 5, 0, 0);
        grafo.insereAresta(14, 6, 1, 1);
        grafo.insereAresta(14, 7, 0, 0);
        grafo.insereAresta(14, 8, 0, 0);
        grafo.insereAresta(14, 9, 0, 0);
        grafo.insereAresta(14, 10, 0, 0);
        grafo.insereAresta(14, 11, 0, 0);
        grafo.insereAresta(14, 12, 0, 0);
        grafo.insereAresta(14, 13, 0, 0);
        grafo.insereAresta(14, 14, 0, 0);
        grafo.insereAresta(14, 15, 0, 7);
        grafo.insereAresta(4, 0, 0, 0);
        grafo.insereAresta(15, 1, 0, 0);
        grafo.insereAresta(15, 2, 0, 0);
        grafo.insereAresta(15, 3, 0, 0);
        grafo.insereAresta(15, 4, 0, 0);
        grafo.insereAresta(15, 5, 0, 0);
        grafo.insereAresta(15, 6, 0, 0);
        grafo.insereAresta(15, 7, 0, 0);
        grafo.insereAresta(15, 8, 0, 2);
        grafo.insereAresta(15, 9, 0, 0);
        grafo.insereAresta(15, 10, 0, 0);
        grafo.insereAresta(15, 11, 0, 0);
        grafo.insereAresta(15, 12, 0, 0);
        grafo.insereAresta(15, 13, 0, 0);
        grafo.insereAresta(15, 14, 0, 0);
        grafo.insereAresta(15, 15, 0, 0);
        

        //Gera o menor caminho
        JAEDsMaps aed = new JAEDsMaps(grafo);
        aed.obterArvoreCMC(0);

        //Imprime o caminho  mais curto
        System.out.println("Algoritmo guloso:");
        aed.imprime(0, 8);

    }

}
