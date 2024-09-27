package tombolaV1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EstraiTombolaV1 extends Thread {
    //VERSIONE Uno
    String nomePersona;
    public ArrayList <Integer> numeriDisponibili =new ArrayList<>();
    int numPresenti=90;

    public void setEstrazione(String nome) {
        nomePersona=nome;
    }

    public void popolaArray(){
        for (int i=1;i<numPresenti+1;i++){ numeriDisponibili.add(i); }
    }

    public void removNumero(int i) {
        numeriDisponibili.remove(i);
        numPresenti--;
    }

    public void estraiNumero() {
        //Essendo che è randomizzata l'estrazione del numero è dura riuscire a far estrarre lo stesso numero, perchè se non bisognerebbe cambiare il codice
        //Si può solo facilitare
        int i= (int) (Math.random() * numPresenti);
        String s;
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch(Exception e) {
            System.out.println(e);
        }
        if (numeriDisponibili.isEmpty())
            s="Numeri terminati.";
        else
            s=nomePersona+" ha estratto: "+numeriDisponibili.get(i);
        System.out.println(s);
        removNumero(i);
    }

    public void run() {
        popolaArray();
        while (numPresenti >0) estraiNumero();
    }
}