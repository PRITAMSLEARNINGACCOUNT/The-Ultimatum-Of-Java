// Interface A is defined with an abstract method run()
interface A {
	public abstract void run();
}

// Class B is defined which implements A and an empty implementation of run()
class B implements A {
	public void run() {}
}
class MyThread extends B{
    @Override
    public void run() {
        System.out.println("NPTEL Java");
    }
}

public class W06_P3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();
    }
}
