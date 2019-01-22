import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics sumAll = new NumberStatistics();
        NumberStatistics sumEven = new NumberStatistics();
        NumberStatistics sumOdd = new NumberStatistics();


        System.out.println("Type numbers: ");


        while (true) {
            int number = reader.nextInt();
            if (number == -1) {
                break;
            } else {
                sumAll.addNumber(number);
                if (number % 2 == 0) {
                    sumEven.addNumber(number);
                } else
                    sumOdd.addNumber(number);
            }
        }
        System.out.println("sum: " + sumAll.sum());
        System.out.println("sum of even: " + sumEven.sum());
        System.out.println("sum of odd: " + sumOdd.sum());
    }


        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order


}
