public class VarArgs {
    static void Java_Method(String... String_Parameter) {
        System.out.println("Argument Recieve In Form Of Array So The Array Is - ");
        for (String Argument : String_Parameter) {
            System.out.println(Argument);
        }
    }

    public static void main(String[] args) {
        Java_Method("Hello", "World", "Java", "Programming", "Language");
    }
}
