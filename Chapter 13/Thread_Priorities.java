class MinimumThread extends Thread {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Minimum Priority Thread");
        }
    }
}

class MediumThread extends Thread {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Medium Priority Thread");
        }
    }
}

class MaximumThread extends Thread {
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("Maximum Priority Thread");
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {
        MinimumThread minThread = new MinimumThread();
        MediumThread medThread = new MediumThread();
        MaximumThread maxThread = new MaximumThread();

        minThread.setPriority(Thread.MIN_PRIORITY);
        medThread.setPriority(Thread.NORM_PRIORITY);
        maxThread.setPriority(Thread.MAX_PRIORITY);

        minThread.start();
        medThread.start();
        maxThread.start();

    }
}
