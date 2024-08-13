public class Method_Overloading {
    public static void Java_Method(String String_Parameter) {
        System.out.println("Argument Recieve : " + String_Parameter);

    }

    public static void Java_Method() {
        System.out.println("No Arguments Recieved So This Method Is Being Called");

    }

    public static void main(String[] args) {
        String Function_Argument = new String("Java Method");
        Java_Method(Function_Argument);
        Java_Method();
    }
}
