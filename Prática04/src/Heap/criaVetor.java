package Heap;

import Item.Item;
import java.util.Random;
import java.util.Scanner;

public class criaVetor {

    public static void main(String[] args) throws Exception{
        Item[] vetorOrdemCrescente;
        Item[] vetorOrdemDecrescente;
        Item[] vetorAleatorio;
        JHeapSort heapSort;
        Scanner scanner = new Scanner(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //int chave = Integer.parseInt(in.readLine());
        int chave;
        int tam;
        Random obj = new Random();

        //Preenche os vetores em ordem crescente.
        tam = 10000;
        System.out.println("Vetores em ordem crescente:");
        for (int i = 0; i <= 9; i++) {
            vetorOrdemCrescente = new Item[tam+1];
            for (int j = 1; j <= tam; j++) {
                chave = j;
                Item item = new Item(chave);
                vetorOrdemCrescente [j] = item;
            }
            heapSort = new JHeapSort();//Cria um heapSort para ordenar o vetor
            System.out.println("Vetor Crescente: " + i + " Comparacoes: " + heapSort.heapsort(vetorOrdemCrescente, tam)); //Imprime o número de comparações

            tam += 10000;
        }

        //Preenche os vetores em ordem decrescente.
        tam = 10000;
        System.out.println("Vetores em ordem decrescente:");
        for (int i = 0; i <= 9; i++) {
            vetorOrdemDecrescente = new Item[tam+1];
            for (int j = tam; j >= 1; j--) {
                chave = j;
                Item item = new Item(chave);
                vetorOrdemDecrescente [j] = item;
            }
            heapSort = new JHeapSort();//Cria um heapSort para ordenar o vetor
            System.out.println("Vetor Decrescente: " + i + " Comparacoes: " + heapSort.heapsort(vetorOrdemDecrescente, tam));  //Imprime o número de comparações
            tam += 10000;
        }

        //Preenche os aleatótios.
        tam = 10000;
        System.out.println("Vetores Aleatorios:");
        for (int i = 0; i <= 9; i++) {
            vetorAleatorio = new Item[tam+1];
            for (int j = 1; j <= tam; j++) {
                chave = obj.nextInt(tam);
                Item item = new Item(chave);
                vetorAleatorio [j] = item;
            }
            heapSort = new JHeapSort();//Cria um heapSort para ordenar o vetor
            System.out.println("Vetor Aleatório: " + i + " Comparacoes: " + heapSort.heapsort(vetorAleatorio, tam)); //Imprime o número de comparações

            tam += 10000;
        }

    }

}
