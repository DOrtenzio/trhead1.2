package tombolaV1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TestTombolaV1 {
    //VERSIONE Uno
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        EstraiTombolaV1 p1=new EstraiTombolaV1();
        p1.setEstrazione("E1");
        EstraiTombolaV1 p2=new EstraiTombolaV1();
        p2.setEstrazione("          E2");
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
