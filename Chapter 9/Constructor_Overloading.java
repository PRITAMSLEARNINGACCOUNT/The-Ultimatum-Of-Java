class Constructor_Overloading_Demonstration {
    public Constructor_Overloading_Demonstration() {
        System.out.println("This Is The Default Constructor With No Arguments Passed To It");
    }

    public Constructor_Overloading_Demonstration(int Parameter) {
        System.out.println("This Is A Parameterized Constructor");
        System.out.println("And The Value Of The Parameter Passed To This Constructor Is - " + Parameter);
    }

}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Constructor_Overloading_Demonstration Object_1 = new Constructor_Overloading_Demonstration();
        Constructor_Overloading_Demonstration Object_2 = new Constructor_Overloading_Demonstration(10);
    }
}
