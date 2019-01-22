import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a first number: ");
        int firstNumber = reader.nextInt();

        System.out.print("Type a second number: ");
        int secondNumber = reader.nextInt();

        if(firstNumber > secondNumber){
            System.out.println("Great number: " + firstNumber);
        } else if (firstNumber < secondNumber){
            System.out.println("Great number: " + secondNumber);
        }else
            System.out.println("The numbers are equal!");
    }
}
