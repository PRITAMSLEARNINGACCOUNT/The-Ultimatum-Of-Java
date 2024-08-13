public class Methods {
    static void Java_Method(String String_Parameter) {
        System.out.println("Argument Recieve : " + String_Parameter);

    }

    int Non_Static_Java_Method(int Parameter) {
        return Parameter + 100;
    }

    public static void main(String[] args) {
        String Function_Argument = new String("Java Method");
        Java_Method(Function_Argument);
        Methods Alternative_Function_Invocation = new Methods();
        int Function_Return_Value = Alternative_Function_Invocation.Non_Static_Java_Method(10);
        System.out.println("Return Value : " + Function_Return_Value);
    }
}