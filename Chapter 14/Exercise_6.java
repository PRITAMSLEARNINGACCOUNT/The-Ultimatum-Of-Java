import java.util.Scanner;

class CannotDivideBy0Exception extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Max input reached";
    }
}

class MaxMultiplierReachedException extends Exception {
    @Override
    public String toString() {
        return "Max multiplier reached";
    }
}

class Calculator {
    private double maxMultiplier = 7000.0;

    public double Division(double Number_1, double Number_2) throws CannotDivideBy0Exception {
        if (Number_2 == 0) {
            throw new CannotDivideBy0Exception();
        }
        return Number_1 / Number_2;
    }

    public double Multiplication(double Number_1, double Number_2) throws MaxMultiplierReachedException {
        if (Number_1 > maxMultiplier || Number_2 > maxMultiplier) {
            throw new MaxMultiplierReachedException();
        }
        return (double) Number_1 * Number_2;
    }

    public double Addition(double Number_1, double Number_2) {
        return (double) Number_1 + Number_2;
    }

    public double Subtraction(double Number_1, double Number_2) {

        return (double) Number_1 - Number_2;
    }

}

public class Exercise_6 {
    public static void main(String[] args) {
        Calculator MyCalculator = new Calculator();
        Scanner Input = new Scanner(System.in);
        double Number_1, Number_2;
        try {
            System.out.println("Enter the first number: ");
            Number_1 = Input.nextDouble();
            System.out.println("Enter the second number: ");
            Number_2 = Input.nextDouble();
            System.out.println(
                    "For Division Press 1\nFor Multiplication Press 2\nFor Addition Press 3\nFor Subtraction Press 4");
            int Choice = Input.nextInt();
            if (Choice > 10000.0 || Number_1 > 10000.0 || Number_2 > 10000.0) {
                throw new MaxInputException();
            }

            try {
                switch (Choice) {
                    case 1:
                        System.out.println(
                                "Division Between " + Number_1 + " And " + Number_2
                                        + " Is - " + MyCalculator.Division(Number_1, Number_2));
                        break;
                    case 2:
                        System.out.println("Multiplication Between " + Number_1 + " And " + Number_2
                                + " Is - " + MyCalculator.Multiplication(Number_1, Number_2));
                        break;
                    case 3:
                        System.out.println("Addition Between " + Number_1 + " And " + Number_2
                                + " Is - " + MyCalculator.Addition(Number_1, Number_2));
                        break;
                    case 4:
                        System.out.println("Subtraction Between " + Number_1 + " And " + Number_2
                                + " Is - " + MyCalculator.Subtraction(Number_1, Number_2));
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            } catch (CannotDivideBy0Exception e) {
                System.out.println(e);
            } catch (MaxMultiplierReachedException e) {
                System.out.println(e);
            }
        } catch (MaxInputException Custom_Error) {
            System.out.println("Invalid Input");
        } catch (Exception Exception) {
            System.out.println(Exception);
        }
    }
}
