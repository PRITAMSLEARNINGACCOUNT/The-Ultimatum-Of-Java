public class Operators {
    public static void main(String[] args) {
        System.out.println("Assignment Operator Which Assigns A Literal Value To A Variable");
        int a = 10;
        int b = 20;
        float c = 25;
        float d = 9;
        a += b;
        System.out.println("Demonstration of Arithmetic Operators");
        System.out.println("Addition Of a + b Is - " + (a + b));
        System.out.println("Subtraction Of a - b Is - " + (a - b));
        System.out.println("Multiplication Of a * b Is -" + (a * b));
        System.out.println("Division Of b / a Is - " + (c / d));
        System.out.println("Modulus/Remainder Of b % a Is - " + (c % d));

        System.out.println("Demonstration of Increment/Decrement In Arithmetic Operators");
        System.out.println("Post Decrement - a++ " + (a++));
        System.out.println("Post Decrement - b-- " + (a--));
        // Check the difference in d++ and ++d
        System.out.println("Pre-Decrement - --b " + (--b));
        System.out.println("Pre-Increment - ++b " + (++b));

        System.out.println("Demonstration Of Comparison Operators Which Are Only Used In Conditional Statements For Evaluating If A Given Expression Is True Or False");
        System.out.println("Is 5 Equal To 5 - " + (5 == 5));
        System.out.println("Is 6 Lesser Than Or Equal To 7 - " + (6 <= 7));
        System.out.println("Is 4 Greater Than Or Equals To 7 - " + (4 >= 7));

        System.out.println("Demonstration Of Logical Operators Which Are Used To Combine Two Or More Expressions In Conditional Statements For Evaluating If A Given Expression Is True Or False");
        System.out.println("Logical AND - 5 < 3 && 5 > 3 - " + (5 > 3 && 5 < 3));
        System.out.println("Logical OR - 5 < 3 || 5 > 3 - " + (5 > 3 || 5 < 3));
        System.out.println("Logical NOT - !true - " + (!true));
    }
}
