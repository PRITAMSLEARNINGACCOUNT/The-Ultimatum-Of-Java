class Practice5Thread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning!");
        }
    }
}

class Practice5Thread_2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class Practice_5 {
    public static void main(String[] args) {
        Practice5Thread MyThread_1 = new Practice5Thread();
        Practice5Thread_2 MyThread_2 = new Practice5Thread_2();
        MyThread_1.start();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        MyThread_2.setPriority(Thread.MIN_PRIORITY);
        MyThread_2.start();

    }
}
