import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Anual Income Of The Employee In Lakhs :- ");
        int Anual_Income = Input.nextInt();
        double Tax = 0.0;
        if (Anual_Income <= 250000) {
            Tax = 0.0;
        } else if (Anual_Income > 250000 && Anual_Income <= 500000) {
            Tax += 0.05 * (Anual_Income - 250000);
        } else if (Anual_Income > 500000 && Anual_Income <= 1000000) {
            Tax += 0.05 * 500000;
            Tax += 0.20 * (Anual_Income - 500000);
        } else {
            Tax += 0.05 * 500000;
            Tax += 0.20 * 500000;
            Tax += 0.30 * (Anual_Income - 1000000);

        }
        System.out.println("The Total Tax Amount Of The Employee is :- " + Tax);

    }
}
