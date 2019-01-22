
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 1;
        // program your solution here. Do not touch the above lines!

        while (true) {
            System.out.println("Guess a number: ");
            int num = reader.nextInt();
            if (num == numberDrawn) {
                System.out.println("Congratulations, you guess is correct!");
                break;
            } else if (num < numberDrawn){
                System.out.println("The number is greater, guesses made " + count++);
            }else {
                System.out.println("The number is lesser, guesses made " + count++);
            }
    }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
