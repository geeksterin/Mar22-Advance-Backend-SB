package threadlocals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        final Runnable runnable1 = () -> {
            System.out.println("T1 is setting Name Store");
            NameStore.setNameStore("T1T1");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T1 reading: " + NameStore.getNameStore());
        };


        final Runnable runnable2 = () -> {
            System.out.println("T2 is setting Name Store");
            NameStore.setNameStore("T2T2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T2 reading: " + NameStore.getNameStore());
        };


        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }
}
