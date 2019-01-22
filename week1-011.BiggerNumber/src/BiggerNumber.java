
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");

        int number1 = reader.nextInt();

        System.out.print("Type another number: ");

        int number2 = reader.nextInt();

        if (number1 > number2){
            System.out.println("The bigger number of the two numbers given was: " + number1);
        } else
            System.out.println("The bigger number of the two numbers given was: " + number2);

    }
}
