
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");

        String name = reader.nextLine();

        int num = 1;

        for (int i = 0; i <= name.length() - 1; i++){
            System.out.println(num++ + ". character: " + name.charAt(i));
        }

    }
}
