
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String enteredWord = "";

        do {
            System.out.println("Type a word: ");
            enteredWord = reader.nextLine();
            words.add(enteredWord);
        } while (!enteredWord.isEmpty());

        Collections.sort(words);
        System.out.println("You typed the following words: ");

        for (String s : words){
            System.out.println(s);
        }
    }
}
