
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");

        int enteredNum = reader.nextInt();

        int num = 0;
        int result = 0;
        while (num <= enteredNum){
            result += num;
            num++;
        }
        System.out.println(result);
    }
}
