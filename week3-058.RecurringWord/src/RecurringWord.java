
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        String enteredWord = "";

         while (true){
             System.out.println("Type a word: ");
             enteredWord = reader.nextLine();
             if (words.contains(enteredWord)){
                 System.out.println("You gave the " + enteredWord + " twice");
                 break;
             }else
             words.add(enteredWord);
         }
        
    }
}
