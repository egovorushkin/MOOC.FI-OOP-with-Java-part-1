import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        int score = 0;
        while (true){
            score = scanner.nextInt();
            if (score <= - 1){
                break;
            } else
                scores.add(score);
        }

        System.out.println("Grade distribution:");
        for (int sc : scores){
            grade.grade(sc);
        }
        grade.printGrades();

        System.out.println("Acceptance percentage: " + grade.acceptancePercentage());




        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
