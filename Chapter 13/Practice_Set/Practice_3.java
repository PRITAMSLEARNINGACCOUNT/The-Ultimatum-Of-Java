class Practice_3Thread extends Thread {
    public void run() {
        System.out.println("This Is A Normal Thread For Practice 3");
    }
}


public class Practice_3 {
    public static void main(String[] args) {
        Practice_3Thread MyThread = new Practice_3Thread();
        System.out.println("The Thread Of First Thread Before Setting The Thread Priority Is - " + MyThread.getPriority());
//        MyThread.setPriority(Thread.MAX_PRIORITY);
        MyThread.setPriority(10);
        MyThread.start();
        System.out.println("The Thread Of First Thread After Setting The Thread Priority Is - " + MyThread.getPriority());
    }
}
