import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        String out = "";
        for (int i = text.length() - 1; i >= 0; i--){
            out = out + text.charAt(i);
        }
        return out;
    }

    public static boolean palindrome(String text) {
        if(text.equals(reverse(text))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
