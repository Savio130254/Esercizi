package esercizi;

public class Esercizio7 {
    /*Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m che in ogni cella ha il valore di indice della cella moltiplicato per n.*/

    public static int[] esercizio7(int n, int m){
        int[] array=new int[m];
        for (int i = 0; i < m; i++) {
            array[i]=i*n;
        }
        return array;
    }

}
