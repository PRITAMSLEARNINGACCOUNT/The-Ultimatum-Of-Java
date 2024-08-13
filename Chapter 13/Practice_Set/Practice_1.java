class PracticeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning!");
        }
    }
}

class PracticeThread_2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class Practice_1 {
    public static void main(String[] args) {
        PracticeThread MyThread_1 = new PracticeThread();
        PracticeThread_2 MyThread_2 = new PracticeThread_2();
        MyThread_1.start();
        MyThread_2.start();
    }
}
