import java.util.Random;
import java.util.Scanner;

class Game {
    private int RandomNumber;
    private int UserInput;
    private int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses() {
        this.noOfGuesses += 1;
    }

    public Game() {
        Random RandomObject = new Random();
        RandomNumber = RandomObject.nextInt(100);
    }

    public void takeUserInput() {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Your Guess: ");
        UserInput = Input.nextInt();
        if (UserInput > 100) {
            System.out.println("Please Enter A Low Value Under 100");
        } else if (UserInput > RandomNumber) {
            System.out.println("You Have Given A Higher Value - Please Enter A Low Value");
        } else if (UserInput < RandomNumber) {
            System.out.println("You Have Given A Lower Value - Please Enter A High Value");
        }
    }

    public boolean isCorrectNumber() {
        return RandomNumber == UserInput;
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        Game GameObject = new Game();
        while (GameObject.isCorrectNumber() != true) {
            GameObject.takeUserInput();
            GameObject.setNoOfGuesses();
        }
        System.out.println("Congratulations! You Have Guessed The Correct Number With " + GameObject.getNoOfGuesses()
                + " No Of Guesses");

    }
}
