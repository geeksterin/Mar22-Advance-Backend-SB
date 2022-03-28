package threadlocals;

public class Main {

    private static String NAME = "";

    public static void main(String[] args) throws InterruptedException {

        /**
         * Without ThreadLocal
         */
        final Runnable runnable = () -> {
            NAME = Thread.currentThread().getName();
            System.out.println("Setting name by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Current Name: " + NAME);
        };

        final Thread t1 = new Thread(runnable);
        final Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        /**
         * With ThreadLocal
         */

        final Thread t3 = new Thread(() -> {
            System.out.println("Setting Name by " + Thread.currentThread().getName());
            NameHolder.setNameHolder(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Reading Name by %s: %s\n\n", Thread.currentThread().getName(), NameHolder.getNameHolder());
        });

        final Thread t4 = new Thread(() -> {
            System.out.println("Setting Name by " + Thread.currentThread().getName());
            NameHolder.setNameHolder(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Reading Name by %s: %s\n\n", Thread.currentThread().getName(), NameHolder.getNameHolder());
        });

        t3.start();
        t4.start();
    }
}
