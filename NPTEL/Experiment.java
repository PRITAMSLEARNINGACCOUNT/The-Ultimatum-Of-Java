interface TestInterface {
    // Public Access Modifier By Default
    void testMethod();
}
class Test implements TestInterface {
    @Override
    // Default Access Modifier By Default
    // Access Modifier Problem Occurs Default vs Public
    void testMethod() {
        // TODO Auto-generated method stub
        System.out.println("Test Method");
    }
    
}
public class Experiment {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}