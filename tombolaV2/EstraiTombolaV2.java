package tombolaV2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class EstraiTombolaV2 extends Thread {
    //VERSIONE Uno
    String nomePersona;

    private ArrayList <Integer> numeriDisponibili =new ArrayList<>();

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
        int i= (int) (Math.random() * numeriDisponibili.size());
        String s;
        if (numeriDisponibili.isEmpty())
            s="Numeri terminati.";
        else
            s=nomePersona+" ha estratto: "+numeriDisponibili.get(i);
        System.out.println(s);
        removNumero(i);
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    public void run() {
        popolaArray();
        while (true) estraiNumero();
    }
}