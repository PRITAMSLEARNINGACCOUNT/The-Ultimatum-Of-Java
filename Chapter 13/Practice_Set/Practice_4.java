class Practice_4Thread extends Thread {
    public void run() {
        System.out.println("This Is A Normal Thread For Practice 4");
    }
}

public class Practice_4 {
    public static void main(String[] args) {
        Practice_4Thread MyThread = new Practice_4Thread();
        System.out.println("The State Of The First Thread Before Running The Thread Is - " + MyThread.getState());
        MyThread.start();
        System.out.println("The State Of The First Thread After Running The Thread Is - " + MyThread.getState());

    }
}
