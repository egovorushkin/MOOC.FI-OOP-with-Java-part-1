import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> persons;

    public Phonebook() {
        persons = new ArrayList<Person>();
    }

    public void add(String name, String number){
        this.persons.add(new Person(name, number));
    }

    public void printAll(){
        for(Person p : this.persons){
            System.out.println(p);
        }
    }

    public String searchNumber(String name){
        for(Person p : this.persons){
            if (p.getName().equals(name)){
                return p.getNumber();
            }
        } return "number not known";
    }
}
