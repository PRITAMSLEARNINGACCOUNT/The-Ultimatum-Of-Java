public class W06_P5 extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
    public static void main(String args[]) {
        W06_P5 t = new W06_P5();
        System.out.println("Name of thread 't':" + t.getName());

        t.setName("NPTEL");
        
    
        new Thread(() -> {
            try {
                Thread.sleep(10); // Small delay to ensure order
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t.run(); // Call run() after last println()
        }).start();
        System.out.println("New name of thread 't':" + t.getName());
    }
}
