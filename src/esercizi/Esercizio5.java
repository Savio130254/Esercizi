package esercizi;


import java.util.Scanner;

public class Esercizio5 {
    /*
    Scrivere un metodo che prenda in input un numero intero  e una stringa. Il metodo chiede all’utente di scrivere n stringhe da tastiera e per ognuna di
    esse torna true o false a seconda se la stringa inizi con quella passata n input.
    */

    public static boolean esercizio5(int n, String s,String frase){
    return frase.startsWith(s);
    }
}
