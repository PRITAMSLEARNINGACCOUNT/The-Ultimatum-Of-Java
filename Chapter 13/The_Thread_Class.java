class Thread_1 extends Thread {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Executing Thread 1");
        }
    }
}

class Thread_2 extends Thread {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Executing Thread 2");
        }
    }
}

public class The_Thread_Class {
    public static void main(String[] args) {
        Thread_1 MyThread_1 = new Thread_1();
        Thread_2 MyThread_2 = new Thread_2();
        MyThread_1.start();
        MyThread_2.start();

    }
}