package esercizi;

public class Esercizio8 {
    /*
     Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri con le stesse frequenze. Ad esempio, gli anagrammi di CAT sono CAT,ACT, TAC, TCA, ATC, e CTA.
     Date due stringhe a e b in input, scrivere un metodo che stampi ´anagrammi’ se sono anagrammi (case-insensitive), ´non anagrammi’ altrimenti.
    */

    /*
    fib(0)=0
    fib(1)=1
    fib(n)=fib(n-1)+fib(n-2)
    n=7 array lungo 7

    */

    public static int esercizio9(int n){
        int array[]=new int[n+1];//n+1 perchè si vuole l'ennessimo numero
        array[0]=0;//inserisco i primi due numeri della sequenza
        array[1]=1;
        for (int i = 2; i <= n; i++) {//per ogni posizione dell'array da 2 a 'n' incluso
            array[i]=array[i-1]+array[i-2];//inserisco nella poszione la somma delle due posziioni
        }
        return array[n];
    }
}
