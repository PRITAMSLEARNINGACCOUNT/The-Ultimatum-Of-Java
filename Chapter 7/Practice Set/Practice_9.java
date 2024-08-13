public class Practice_9 {
    static float Celsius_To_Fahrenheit(float Celsius) {
        return Celsius * (9.0f / 5.0f) + 32.0f;
    }

    public static void main(String[] args) {
        System.out.println("Please Enter The Temperature In Celsius: ");
        java.util.Scanner Input = new java.util.Scanner(System.in);
        float Celsius = Input.nextFloat();
        System.out.println("The Temperature In Fahrenheit Is: " + Celsius_To_Fahrenheit(Celsius));
    }
}
