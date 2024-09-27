package estraiBiglietto;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class PrendiBigliettoThread extends Thread {
    static int cont=0;

    String nomePersona;

    public void settaNomePersona(String nome) {
        nomePersona=nome;
    }

    public int leggiContatore() {
        return cont;
    }

    public void settaContatore(int valore) {
        cont=valore;
    }

    public void prendiBiglietto() {
        int c=leggiContatore();

        //attivare per mostrare il problema
        try {
          TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }

        settaContatore(c+1);
        System.out.println(nomePersona+": il numero che ho preso +"+(c+1));
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }

    }

    public void run() {
        while(true) {
            prendiBiglietto();
        }
    }

    public static void main(String[] args) {
        PrendiBigliettoThread p1=new PrendiBigliettoThread();
        p1.settaNomePersona("bernini");
        PrendiBigliettoThread p2=new PrendiBigliettoThread();
        p2.settaNomePersona("grena");
        p1.start();
        p2.start();
        System.out.println("Premere ENTER per chiudere");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }
}