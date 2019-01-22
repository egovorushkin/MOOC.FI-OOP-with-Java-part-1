
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");

        double pow = reader.nextInt();
        int result = 0;
        int num = 0;

        while(num <= pow){
            result += (int)Math.pow(2, num);
            num++;
        }
        System.out.println("The result is " + result);
    }
}
