class NormalThread_1 extends Thread {
    public NormalThread_1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Executing Thread 1");
        }
    }
}

class NormalThread_2 extends Thread {
    public NormalThread_2(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Executing Thread 2");
        }
    }
}

public class Thread_Constructors_2 {
    public static void main(String[] args) {

        NormalThread_1 Thread_1 = new NormalThread_1("Normal Thread 1");
        NormalThread_2 Thread_2 = new NormalThread_2("Normal Thread 2");
        System.out.println("The Name Of The First Thread Is - " + Thread_1.getName());
        System.out.println("The Name Of The Second Thread Is - " + Thread_2.getName());
        // Thread_1.start(); --> Not Starting The Thread
        // Thread_2.start(); --> Not Starting The Thread
    }
}
