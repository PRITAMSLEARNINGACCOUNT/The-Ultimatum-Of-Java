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

public class Thread_Constructors {
    public static void main(String[] args) {
        RunnableThread RunnableThread_1 = new RunnableThread();
        RunnableThread_2 RunnableThread_2 = new RunnableThread_2();
        Thread Thread_1 = new Thread(RunnableThread_1, "Runnable Thread 1");
        Thread Thread_2 = new Thread(RunnableThread_2, "Runnable Thread 2");
        System.out.println("The Name Of The First Thread Is - " + Thread_1.getName());
        System.out.println("The Name Of The Second Thread Is - " + Thread_2.getName());
        // Thread_1.start(); --> Not Starting The Thread
        // Thread_2.start(); --> Not Starting The Thread
    }
}
