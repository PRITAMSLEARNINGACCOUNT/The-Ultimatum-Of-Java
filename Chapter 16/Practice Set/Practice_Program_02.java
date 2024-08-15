class CustomClass {
    @Deprecated
    public void DeprecatedMethod() {
        System.out.println("This Is A Deprecated Method");
    }
}

public class Practice_Program_02 {
    public static void main(String[] args) {
        CustomClass MyObject = new CustomClass();
        MyObject.DeprecatedMethod();
    }
}
