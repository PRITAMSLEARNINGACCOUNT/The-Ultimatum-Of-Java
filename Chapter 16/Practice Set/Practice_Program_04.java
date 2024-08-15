@FunctionalInterface
interface MyInterface {
    void LambdaMethod();
}

public class Practice_Program_04 {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("Hello World");
        myInterface.LambdaMethod();
    }
}
