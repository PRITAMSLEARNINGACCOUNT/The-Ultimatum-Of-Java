class RunnableThread implements Runnable {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Executing Runnable Thread 1");
        }
    }
}

class RunnableThread_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Executing Runnable Thread 2");
        }
    }
}

public class Runnable_Interface {
    public static void main(String[] args) {
        RunnableThread MyRunnableThread = new RunnableThread();
        RunnableThread_2 MyRunnableThread_2 = new RunnableThread_2();
        Thread MyThread_1 = new Thread(MyRunnableThread);
        Thread MyThread_2 = new Thread(MyRunnableThread_2);
        MyThread_1.start();
        MyThread_2.start();
    }
}
