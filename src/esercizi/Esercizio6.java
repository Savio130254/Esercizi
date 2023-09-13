package esercizi;

public class Esercizio6 {

    /*Scrivete una funzione che dato un array di valori ne restituisce
     una copia dove i numeri dispari sono stati moltiplicati per 2.*/

    public static int[] doubleOdd(int[] array){
        int[] copy=new int[array.length];
        for(int i = 0; i<array.length; i++){
            if(Math.abs(array[i])%2==1){
                copy[i]=array[i]*2;
            }
            else copy[i]=array[i];
        }
        return copy;
    }

}
