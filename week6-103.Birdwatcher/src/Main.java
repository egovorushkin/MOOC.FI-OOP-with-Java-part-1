import java.awt.image.ImageObserver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BirdsDB birds = new BirdsDB();
        Scanner scanner = new Scanner(System.in);
        String command = "";

        while (true) {
            System.out.print("? ");
            command = scanner.nextLine();
            if (command.equals("Add")) {
                System.out.print("Name: ");
                command = scanner.nextLine();
                Bird bird = new Bird();
                bird.setName(command);
                System.out.print("Latin Name: ");
                command = scanner.nextLine();
                bird.setLatinName(command);
                birds.addBird(bird);
            } else if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                command = scanner.nextLine();
                birds.search(command);

            } else if (command.equals("Statistics")) {
                birds.statistics();
            } else if (command.equals("Show")) {
                System.out.print("What? ");
                command = scanner.nextLine();
                birds.showBird(command);
            } else if (command.equals("Quit")) {
                break;
            }
        }
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

    }

}