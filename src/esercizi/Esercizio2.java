package esercizi;

public class Esercizio2 {

/*Scrivere un metodo che prenda in input una stringa e ritorna la stringa
  inversa. Ad esempio se l'input è "ciao" il metodo tornerà "oaic".*/

public static String invertiStringa(String s){
    String inversa = ""; //dichiaro una nuova variabile dove salverò la stringa inversa
    for(int i=s.length()-1; i>=0;i--) {
        inversa += s.charAt(i);
    }
    return inversa;
}

}
