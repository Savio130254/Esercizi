package esercizi;

import java.util.Arrays;

public class Esercizio9 {
    public static void esercizio9(String a, String b){
        a=a.toLowerCase().replaceAll("\\s","");//elimina ogni spazio vuoto
        b=b.toLowerCase().replaceAll("\\s","");
        if(a.length()!=b.length()){ //controlla la lunghezza delle due stringhe
            System.out.println("non anagrammi");
            return;//termino la funzione
        }
        char[] array_a =a.toCharArray();//creo array di caratteri di a
        char[] array_b =b.toCharArray();//creo array di caratteri di b
        Arrays.sort(array_a);//ordino array_a
        Arrays.sort(array_b);//ordino array_b
        if(Arrays.equals(array_a,array_b)){ //confronto se i due array ordinati sono uguali
            System.out.println("sono anagrammi");
        }
        else{
            System.out.println("non sono anagrammi:(");
        }
    }
}
