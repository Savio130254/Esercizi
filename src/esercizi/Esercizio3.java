package esercizi;

public class Esercizio3 {

    /*
    fattoriale(0)=1
    fattoriale(1)=2
    fattoriale(n)=1*2*...*(n-1)
    * */
    public static int fattoriale_iterativo(int n){
        if(n<0){
            System.out.println("ERRORE: input negativo!");
            return -1;
        }
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    /*
    fattoriale(0)=1
    fattoriale(1)=2
    fattoriale(n)= fattoriale(n-1)*n
    * */
    public static int fattoriale_ricorsivo(int n){
        if(n<=1)return 1;
        else return n*fattoriale_ricorsivo(n-1);
    }

}
