@FunctionalInterface
interface LambdaDemo {
    void LambdaMethod();
}

public class Lambda_Expressions {
    public static void main(String[] args) {
        LambdaDemo Demonstrations = () -> System.out
                .println("Functional Interface Method Implemented Using Lambda Expression");
        Demonstrations.LambdaMethod();
    }

}