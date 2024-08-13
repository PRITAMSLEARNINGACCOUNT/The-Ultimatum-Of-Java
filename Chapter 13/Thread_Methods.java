class MyNormalThread_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Normal Thread 1");
        }
    }
}

class MyNormalThread_2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Normal Thread 2");
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        MyNormalThread_1 NM1 = new MyNormalThread_1();
        MyNormalThread_2 NM2 = new MyNormalThread_2();
        NM1.start();
        try {

            NM1.join();
            System.out.println("The Priority Of Thread 1" + NM1.getPriority());
        } catch (Exception e) {
            System.out.println("Exception Occured In First Thread - " + e);

        }
        NM2.start();
        try {

            NM2.join();
            System.out.println("The Priority Of Thread 1" + NM2.getPriority());

        } catch (Exception e) {
            System.out.println("Exception Occured In Second Thread - " + e);
        }

    }
}