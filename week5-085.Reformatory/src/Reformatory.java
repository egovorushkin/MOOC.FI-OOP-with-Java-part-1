public class Reformatory {
    private int count = 0;
    public int weight(Person person) {
        this.count++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
        person.getWeight();
    }

    public int totalWeightsMeasured(){
        return count;
    }

}
