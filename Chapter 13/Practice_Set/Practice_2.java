
class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException Exception) {
//                System.out.println("The Following Exception Occurred: " + Exception);
//            }
            System.out.println("Good Morning!");
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException Exception) {
                System.out.println("The Following Exception Occurred: " + Exception);
            }
            System.out.println("Welcome");
        }
    }
}

public class Practice_2 {
    public static void main(String[] args) {
        GoodMorningThread MyThread_1 = new GoodMorningThread();
        WelcomeThread MyThread_2 = new WelcomeThread();
        MyThread_1.start();
        MyThread_2.start();
    }
}
