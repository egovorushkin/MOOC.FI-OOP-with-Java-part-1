
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int firstNum = reader.nextInt();

        System.out.print("Last: ");
        int lastNum = reader.nextInt();

        int num = firstNum;

        while (num <= lastNum){
            System.out.println(num++);
        }
    }
}
