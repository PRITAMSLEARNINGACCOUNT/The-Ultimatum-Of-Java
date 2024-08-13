class Access_Modifieres_Demonstration {
    private int Private_Varriable_1 = 10;
    private int Private_Varriable_2 = 20;
    private int Private_Varriable_3 = 30;

    public Access_Modifieres_Demonstration() {
        System.out.println("This Is The Default Constructor With No Arguments Passed To It");
        System.out.println("The Value Of Private_Varriable_1 Declared Under This Class Is - " + Private_Varriable_1);
        System.out.println("The Value Of Private_Varriable_2 Declared Under This Class Is - " + Private_Varriable_2);
        System.out.println("The Value Of Private_Varriable_3 Declared Under This Class Is - " + Private_Varriable_3);
        System.out.println("The Value Of These Private Varriables Can Only Be Accessed Within This Class");
    }
}

public class Access_Modifieres {
    public static void main(String[] args) {
        Access_Modifieres_Demonstration Object_1 = new Access_Modifieres_Demonstration();
    }
}
