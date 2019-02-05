import TAD.JAGM;
import TAD.JGrafo;

public class main {
    public static void main (String[] args) throws Exception {

        //Exercício 1:
        JGrafo grafo = new JGrafo(8);//Cria um grafo de 8 vértices

        //Chama a função para inserir elementos no primeiro grafo
        grafo.insereAresta(0, 0, 0);
        grafo.insereAresta(0, 1, 1);
        grafo.insereAresta(0, 2, 0);
        grafo.insereAresta(0, 3, 1);
        grafo.insereAresta(0, 4, 1);
        grafo.insereAresta(0, 5, 0);
        grafo.insereAresta(0, 6, 0);
        grafo.insereAresta(0, 7, 0);
        grafo.insereAresta(1, 0, 1);
        grafo.insereAresta(1, 1, 0);
        grafo.insereAresta(1, 2, 1);
        grafo.insereAresta(1, 3, 0);
        grafo.insereAresta(1, 4, 0);
        grafo.insereAresta(1, 5, 1);
        grafo.insereAresta(1, 6, 0);
        grafo.insereAresta(1, 7, 0);
        grafo.insereAresta(2, 0, 0);
        grafo.insereAresta(2, 1, 1);
        grafo.insereAresta(2, 2, 0);
        grafo.insereAresta(2, 3, 1);
        grafo.insereAresta(2, 4, 0);
        grafo.insereAresta(2, 5, 0);
        grafo.insereAresta(2, 6, 1);
        grafo.insereAresta(2, 7, 0);
        grafo.insereAresta(3, 0, 1);
        grafo.insereAresta(3, 1, 0);
        grafo.insereAresta(3, 2, 1);
        grafo.insereAresta(3, 3, 0);
        grafo.insereAresta(3, 4, 0);
        grafo.insereAresta(3, 5, 0);
        grafo.insereAresta(3, 6, 0);
        grafo.insereAresta(3, 7, 1);
        grafo.insereAresta(4, 0, 1);
        grafo.insereAresta(4, 1, 0);
        grafo.insereAresta(4, 2, 0);
        grafo.insereAresta(4, 3, 0);
        grafo.insereAresta(4, 4, 0);
        grafo.insereAresta(4, 5, 1);
        grafo.insereAresta(4, 6, 0);
        grafo.insereAresta(4, 7, 1);
        grafo.insereAresta(5, 0, 0);
        grafo.insereAresta(5, 1, 1);
        grafo.insereAresta(5, 2, 0);
        grafo.insereAresta(5, 3, 0);
        grafo.insereAresta(5, 4, 1);
        grafo.insereAresta(5, 5, 0);
        grafo.insereAresta(5, 6, 1);
        grafo.insereAresta(5, 7, 0);
        grafo.insereAresta(6, 0, 0);
        grafo.insereAresta(6, 1, 0);
        grafo.insereAresta(6, 2, 1);
        grafo.insereAresta(6, 3, 0);
        grafo.insereAresta(6, 4, 0);
        grafo.insereAresta(6, 5, 1);
        grafo.insereAresta(6, 6, 0);
        grafo.insereAresta(6, 7, 1);
        grafo.insereAresta(7, 0, 0);
        grafo.insereAresta(7, 1, 0);
        grafo.insereAresta(7, 2, 0);
        grafo.insereAresta(7, 3, 1);
        grafo.insereAresta(7, 4, 1);
        grafo.insereAresta(7, 5, 0);
        grafo.insereAresta(7, 6, 1);
        grafo.insereAresta(7, 7, 0);

        //Gera a arvore mínima
        JAGM agm = new JAGM(grafo);
        agm.obterAgm(0);

        //Informa o peso da Árvore Geradora Mínima
        System.out.println("O peso da Árvore Geradora Mínima é: " + agm.pesoAGM());

        //Informa as arestas que constituem a Árvore
        agm.imprime();

        //Exercício 2:

        //Criação dos grafos:
        JGrafo primeiroGrafo = new JGrafo(9);
        JGrafo segundoGrafo = new JGrafo(8);

        //Chama a função para inserir elementos no primeiro  grafo
        primeiroGrafo.insereAresta(0,0,0);
        primeiroGrafo.insereAresta(0,1,5);
        primeiroGrafo.insereAresta(0,2,0);
        primeiroGrafo.insereAresta(0,3,10);
        primeiroGrafo.insereAresta(0,4,5);
        primeiroGrafo.insereAresta(0,5,0);
        primeiroGrafo.insereAresta(0,6,10);
        primeiroGrafo.insereAresta(0,7,10);
        primeiroGrafo.insereAresta(0,8,0);
        primeiroGrafo.insereAresta(1,0,5);
        primeiroGrafo.insereAresta(1,1,0);
        primeiroGrafo.insereAresta(1,2,0);
        primeiroGrafo.insereAresta(1,3,0);
        primeiroGrafo.insereAresta(1,4,5);
        primeiroGrafo.insereAresta(1,5,0);
        primeiroGrafo.insereAresta(1,6,0);
        primeiroGrafo.insereAresta(1,7,5);
        primeiroGrafo.insereAresta(1,8,10);
        primeiroGrafo.insereAresta(2,0,0);
        primeiroGrafo.insereAresta(2,1,0);
        primeiroGrafo.insereAresta(2,2,0);
        primeiroGrafo.insereAresta(2,3,5);
        primeiroGrafo.insereAresta(2,4,10);
        primeiroGrafo.insereAresta(2,5,0);
        primeiroGrafo.insereAresta(2,6,5);
        primeiroGrafo.insereAresta(2,7,0);
        primeiroGrafo.insereAresta(2,8,0);
        primeiroGrafo.insereAresta(3,0,10);
        primeiroGrafo.insereAresta(3,1,0);
        primeiroGrafo.insereAresta(3,2,5);
        primeiroGrafo.insereAresta(3,3,0);
        primeiroGrafo.insereAresta(3,4,5);
        primeiroGrafo.insereAresta(3,5,0);
        primeiroGrafo.insereAresta(3,6,10);
        primeiroGrafo.insereAresta(3,7,0);
        primeiroGrafo.insereAresta(3,8,0);
        primeiroGrafo.insereAresta(4,0,5);
        primeiroGrafo.insereAresta(4,1,0);
        primeiroGrafo.insereAresta(4,2,10);
        primeiroGrafo.insereAresta(4,3,5);
        primeiroGrafo.insereAresta(4,4,0);
        primeiroGrafo.insereAresta(4,5,0);
        primeiroGrafo.insereAresta(4,6,0);
        primeiroGrafo.insereAresta(4,7,0);
        primeiroGrafo.insereAresta(4,8,10);
        primeiroGrafo.insereAresta(5,0,0);
        primeiroGrafo.insereAresta(5,1,5);
        primeiroGrafo.insereAresta(5,2,0);
        primeiroGrafo.insereAresta(5,3,0);
        primeiroGrafo.insereAresta(5,4,0);
        primeiroGrafo.insereAresta(5,5,0);
        primeiroGrafo.insereAresta(5,6,15);
        primeiroGrafo.insereAresta(5,7,0);
        primeiroGrafo.insereAresta(5,8,0);
        primeiroGrafo.insereAresta(6,0,10);
        primeiroGrafo.insereAresta(6,1,0);
        primeiroGrafo.insereAresta(6,2,5);
        primeiroGrafo.insereAresta(6,3,10);
        primeiroGrafo.insereAresta(6,4,0);
        primeiroGrafo.insereAresta(6,5,15);
        primeiroGrafo.insereAresta(6,6,0);
        primeiroGrafo.insereAresta(6,7,0);
        primeiroGrafo.insereAresta(6,8,0);
        primeiroGrafo.insereAresta(7,0,10);
        primeiroGrafo.insereAresta(7,1,5);
        primeiroGrafo.insereAresta(7,2,0);
        primeiroGrafo.insereAresta(7,3,0);
        primeiroGrafo.insereAresta(7,4,0);
        primeiroGrafo.insereAresta(7,5,0);
        primeiroGrafo.insereAresta(7,6,0);
        primeiroGrafo.insereAresta(7,7,0);
        primeiroGrafo.insereAresta(7,8,20);
        primeiroGrafo.insereAresta(8,0,0);
        primeiroGrafo.insereAresta(8,1,10);
        primeiroGrafo.insereAresta(8,2,0);
        primeiroGrafo.insereAresta(8,3,0);
        primeiroGrafo.insereAresta(8,4,10);
        primeiroGrafo.insereAresta(8,5,0);
        primeiroGrafo.insereAresta(8,6,0);
        primeiroGrafo.insereAresta(8,7,20);
        primeiroGrafo.insereAresta(8,8,0);

        //Chama a função para inserir elementos no segundo grafo
        segundoGrafo.insereAresta(0,0,0);
        segundoGrafo.insereAresta(0,1,8);
        segundoGrafo.insereAresta(0,2,2);
        segundoGrafo.insereAresta(0,3,0);
        segundoGrafo.insereAresta(0,4,0);
        segundoGrafo.insereAresta(0,5,0);
        segundoGrafo.insereAresta(0,6,9);
        segundoGrafo.insereAresta(0,7,0);
        segundoGrafo.insereAresta(1,0,8);
        segundoGrafo.insereAresta(1,1,0);
        segundoGrafo.insereAresta(1,2,3);
        segundoGrafo.insereAresta(1,3,2);
        segundoGrafo.insereAresta(1,4,7);
        segundoGrafo.insereAresta(1,5,5);
        segundoGrafo.insereAresta(1,6,0);
        segundoGrafo.insereAresta(1,7,6);
        segundoGrafo.insereAresta(2,0,2);
        segundoGrafo.insereAresta(2,1,3);
        segundoGrafo.insereAresta(2,2,0);
        segundoGrafo.insereAresta(2,3,9);
        segundoGrafo.insereAresta(2,4,0);
        segundoGrafo.insereAresta(2,5,0);
        segundoGrafo.insereAresta(2,6,6);
        segundoGrafo.insereAresta(2,7,0);
        segundoGrafo.insereAresta(3,0,0);
        segundoGrafo.insereAresta(3,1,2);
        segundoGrafo.insereAresta(3,2,9);
        segundoGrafo.insereAresta(3,3,0);
        segundoGrafo.insereAresta(3,4,6);
        segundoGrafo.insereAresta(3,5,0);
        segundoGrafo.insereAresta(3,6,2);
        segundoGrafo.insereAresta(3,7,0);
        segundoGrafo.insereAresta(4,0,0);
        segundoGrafo.insereAresta(4,1,7);
        segundoGrafo.insereAresta(4,2,0);
        segundoGrafo.insereAresta(4,3,6);
        segundoGrafo.insereAresta(4,4,0);
        segundoGrafo.insereAresta(4,5,5);
        segundoGrafo.insereAresta(4,6,4);
        segundoGrafo.insereAresta(4,7,0);
        segundoGrafo.insereAresta(5,0,0);
        segundoGrafo.insereAresta(5,1,5);
        segundoGrafo.insereAresta(5,2,0);
        segundoGrafo.insereAresta(5,3,0);
        segundoGrafo.insereAresta(5,4,5);
        segundoGrafo.insereAresta(5,5,0);
        segundoGrafo.insereAresta(5,6,6);
        segundoGrafo.insereAresta(5,7,4);
        segundoGrafo.insereAresta(6,0,9);
        segundoGrafo.insereAresta(6,1,0);
        segundoGrafo.insereAresta(6,2,6);
        segundoGrafo.insereAresta(6,3,2);
        segundoGrafo.insereAresta(6,4,4);
        segundoGrafo.insereAresta(6,5,6);
        segundoGrafo.insereAresta(6,6,0);
        segundoGrafo.insereAresta(6,7,3);
        segundoGrafo.insereAresta(7,0,0);
        segundoGrafo.insereAresta(7,1,6);
        segundoGrafo.insereAresta(7,2,0);
        segundoGrafo.insereAresta(7,3,0);
        segundoGrafo.insereAresta(7,4,0);
        segundoGrafo.insereAresta(7,5,4);
        segundoGrafo.insereAresta(7,6,3);
        segundoGrafo.insereAresta(7,7,0);

        //Gera as árvores mínimas
        JAGM primeiraAgm = new JAGM(primeiroGrafo);
        primeiraAgm.obterAgm(0);
        JAGM segundaAgm = new JAGM(segundoGrafo);
        segundaAgm.obterAgm(0);

        //Informa o peso da Árvore Geradora Mínima para o primeira grafo
        System.out.println("O peso da primeira Árvore Geradora Mínima é: " + primeiraAgm.pesoAGM());

        //Informa as arestas que constituem a primeira Árvore
        primeiraAgm.imprime();

        //Informa o peso da Árvore Geradora Mínima para o segundo grafo
        System.out.println("O peso da segunda Árvore Geradora Mínima é: " + segundaAgm.pesoAGM());

        //Informa as arestas que constituem a segunda Árvore
        segundaAgm.imprime();
    }
}
