package ArvoreSBB;

import Item.Item;
import java.util.Random;
import java.util.Scanner;

public class CriaArvore {
    public static void main(String[] args) throws Exception{
        ArvoreSBB[] arvoreOrdenada = new ArvoreSBB[10];
        ArvoreSBB[] arvoreAleatoria = new ArvoreSBB[10];
        Scanner scanner = new Scanner(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //int chave = Integer.parseInt(in.readLine());
        int chave;
        int n = 10000;
        Random obj = new Random();

        //Cria as árvores ordenadas.
        for(int i = 0; i < arvoreOrdenada.length; i++){
            arvoreOrdenada[i] = new ArvoreSBB();
        }

        //Cria as árvores aleatórias.
        for(int i = 0; i < arvoreOrdenada.length; i++){
            arvoreAleatoria[i] = new ArvoreSBB();
        }

        //Preenche as árvores ordenadas
        for (int i = 0; i < arvoreOrdenada.length; i++) {
            for (int j = 1; j <= n; j++) {
                chave = j;
                Item item = new Item(chave);
                System.out.println(" i: " + i + " j: " + j + " Chave: " + item.getChave());
                arvoreOrdenada[i].insere(item);
                //chave = Integer.parseInt(in.readLine());
            }
            n += 10000;
        }
        n = 10000;

        //Preenche as árvores aleatórias.
        for (int i = 0; i < arvoreAleatoria.length; i++) {
            for (int j = 1; j <= n; j++) {
                chave = obj.nextInt(n);
                Item item = new Item(chave);
                System.out.println(" i: " + i + " j: " + j + " Chave: " + item.getChave());
                arvoreAleatoria[i].insere(item);
                //chave = Integer.parseInt(in.readLine());
            }
            n += 10000;
        }

        //Pesquisa um elemento na árvore
        int controlWhile = 1;
        while (controlWhile != 0){
            System.out.println("Digite 1 para pesquisar na árvore ordenada.\nDigite 2 para pesquisar na árvore aleatória\nDigite 0 para sair");
            System.out.println("opção: ");
            controlWhile = scanner.nextInt();

            if(controlWhile == 1) {
                System.out.println("Digite em qual árvore ordenada pesquisar: ");
                int j = scanner.nextInt();

                if (j < 0 || j > 9) {
                    System.out.println("Árvore não encontrada.");
                } else {
                    System.out.println("Digite o numero a ser pesquisado: ");
                    int i = scanner.nextInt();
                    Item item = new Item(i);
                    long startTime = System.nanoTime();
                    item = arvoreOrdenada[j].pesquisa(item);
                    long estimatedTime = System.nanoTime() - startTime;
                    if (item != null) {
                        System.out.println("Chave retornada: " + item.getChave() + " Numero de comparaçoes: " + item.getNumComparacoes());
                    }
                    System.out.println("Tempo gasto: " + estimatedTime);
                }
            }
            else if(controlWhile == 2){
                System.out.println("Digite em qual árvore aleatória pesquisar: ");
                int j = scanner.nextInt();

                if (j < 0 || j > 9) {
                    System.out.println("Árvore não encontrada.");
                }
                else {
                    System.out.println("Digite o numero a ser pesquisado: ");
                    int i = scanner.nextInt();
                    Item item = new Item(i);
                    long startTime = System.nanoTime();
                    item = arvoreAleatoria[j].pesquisa(item);
                    long estimatedTime = System.nanoTime() - startTime;
                    if (item != null) {
                        System.out.println("Chave retornada: " + item.getChave() + " Numero de comparaçoes: " + item.getNumComparacoes());
                    }
                    System.out.println("Tempo gasto: " + estimatedTime);
                }
            }
            else if(controlWhile == 0){
                System.out.println("Pesquisa encerrada.");
            }
            else
                System.out.println("Digite um número válido!");
        }
    }
}
