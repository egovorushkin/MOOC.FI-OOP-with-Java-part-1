import java.util.ArrayList;

public class BirdsDB {
    ArrayList<Bird> birds;

    public BirdsDB() {
        birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void statistics() {
        for (Bird b : this.birds) {
            System.out.println(b);
        }

    }

    public void showBird(String name) {
        for(Bird b : this.birds){
            if(b.getName().equals(name)){
                System.out.println(b);
            }
        }
    }

    public void search(String name) {
        for (Bird b : this.birds) {
            if (b.getName().equals(name)) {
                b.increaseObservation();
            } else
                System.out.println("Is not a bird!");
        }

    }
}