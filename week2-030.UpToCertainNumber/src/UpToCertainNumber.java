
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int num = reader.nextInt();
        int num2 = 1;

        while(num2 <= num){
            System.out.println(num2++);
        }
    }
}
