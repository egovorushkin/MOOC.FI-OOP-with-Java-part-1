
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Scanner scanner = new Scanner(System.in);
        String name = "";
        String stdNumber;

            while (true) {

            System.out.println("name: ");
            name = scanner.nextLine();

                if (!name.isEmpty()) {
                    System.out.println("studentnumber: ");
                    stdNumber = scanner.nextLine();
                    Student student = new Student(name, stdNumber);
                    students.add(student);
            } else {
                break;
            }

        }
       for (Student s : students){
           System.out.println(s);
       }

        System.out.println("Give search term: ");
        String term = scanner.nextLine();
        System.out.println("Result: ");

        for (Student std : students){
            if(std.getName().contains(term)){
                System.out.println(std);
            }
        }
    }
}
