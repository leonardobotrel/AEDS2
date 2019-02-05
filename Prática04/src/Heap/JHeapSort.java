package Heap;
import Item.Item;

public class JHeapSort {

    public static int heapsort (Item v[], int n) {
        JHeap heap = new JHeap(v); //Cria um heap Jheap.
        int dir = n;
        int cont = 0;

        heap.comp = 0;

        heap.constroi(); //Constroi o heap.

        //Ordena o vetor.
        while (dir > 1) {
            cont++;
            Item x = v[1];
            v[1] = v[dir];
            v[dir] = x;
            dir--;
            heap.refaz(1, dir);
        }

        cont = heap.comp / cont;

        return heap.comp; // Retorna o número de comparações
    }

}
