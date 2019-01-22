
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int firtNumber = reader.nextInt();

        System.out.println("Last: ");
        int lastNumber = reader.nextInt();

        int number = 0;
        int result = 0;
        while(firtNumber <= lastNumber){
            result += firtNumber;
            firtNumber++;
        }
        System.out.println(result);
    }
}
