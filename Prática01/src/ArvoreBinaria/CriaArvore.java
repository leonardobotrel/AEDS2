package ArvoreBinaria;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import Item.Item;

import java.util.Random;
import java.util.Scanner;

public class CriaArvore {
    public static void main(String[] args) throws Exception{
        ArvoreBinaria[] arvoreOrdenada = new ArvoreBinaria[9];
        ArvoreBinaria[] arvoreAleatoria = new ArvoreBinaria[9];
        Scanner scanner = new Scanner(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //int chave = Integer.parseInt(in.readLine());
        int chave;
        int n = 1000;
        Random obj = new Random();

        //Cria as árvores ordenadas.
        for(int i = 0; i < arvoreOrdenada.length; i++){
            arvoreOrdenada[i] = new ArvoreBinaria();
        }

        //Cria as árvores aleatórias.
        for(int i = 0; i < arvoreOrdenada.length; i++){
            arvoreAleatoria[i] = new ArvoreBinaria();
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
            n += 1000;
        }
        n = 1000;

        //Preenche as árvores aleatórias.
        for (int i = 0; i < arvoreAleatoria.length; i++) {
            for (int j = 1; j <= n; j++) {
                chave = obj.nextInt(n);
                Item item = new Item(chave);
                System.out.println(" i: " + i + " j: " + j + " Chave: " + item.getChave());
                arvoreAleatoria[i].insere(item);
                //chave = Integer.parseInt(in.readLine());
            }
            n += 1000;
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

                if (j < 0 || j > 8) {
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

                if (j < 0 || j > 8) {
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
