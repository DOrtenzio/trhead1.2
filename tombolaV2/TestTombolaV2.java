package tombolaV2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TestTombolaV2 {
    //VERSIONE DUE
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        EstraiTombolaV2 p1=new EstraiTombolaV2();
        p1.setEstrazione("E1");
        EstraiTombolaV2 p2=new EstraiTombolaV2();
        p2.setEstrazione("          E2");
        p1.popolaArray();
        p1.start();
        p2.start();

        System.out.println("Inserire ENTER per uscire");
        try {
            in.nextLine();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}