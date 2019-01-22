import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");

        int num = reader.nextInt();

        int res = 1;
        int i = 1;
        while (i <= num){
            res *= i;
            i++;
        }
        System.out.println("Factorial is " + res);
    }
}
