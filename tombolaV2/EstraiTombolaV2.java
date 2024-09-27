package tombolaV2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EstraiTombolaV2 extends Thread {
    //VERSIONE DUE
    String nomePersona;

    private static ArrayList <Integer> numeriDisponibili =new ArrayList<>();

    public void setEstrazione(String nome) {
        nomePersona=nome;
    }

    public void popolaArray(){
        for (int i=1;i<91;i++){ numeriDisponibili.add(i); }
    }

    public void removNumero(int i) {
        numeriDisponibili.remove(i);
    }

    public void estraiNumero() {
        //Essendo che è randomizzata l'estrazione del numero è dura riuscire a far estrarre lo stesso numero, perchè se non bisognerebbe cambiare il codice
        //Si può solo facilitare
        int i= (int) (Math.random() * numeriDisponibili.size());
        String s;
        if (numeriDisponibili.isEmpty())
            s="Numeri terminati.";
        else
            s=nomePersona+" ha estratto: "+numeriDisponibili.get(i)+" size: "+numeriDisponibili.size();
        System.out.println(s);

        removNumero(i);

    }

    public void run() {
        while (true) estraiNumero();
    }
}