import esercizi.Esercizio1;
import esercizi.Esercizio2;
import esercizi.Esercizio3;
import esercizi.Esercizio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*String s = input.nextLine();
        System.out.println("La stringa ha lunghezza dispari? " + Esercizio1.esercizio1(s));*/

        System.out.print("inserisci una stringa da invertire\n");
        String parola=input.nextLine();
        System.out.println(Esercizio2.invertiStringa(parola));

        System.out.println("inserisci");
        int number = input.nextInt();
        System.out.println("il"+ Esercizio3.fattoriale_iterativo(number));
        System.out.println("inserisci");
        number = input.nextInt();
        System.out.println("il"+ Esercizio3.fattoriale_ricorsivo(number));

        System.out.println("inserisci i secondi");
        int n = input.nextInt();
        System.out.println(Esercizio4.esercizio4(n));
        System.out.println("ciaoooo");


    }
}