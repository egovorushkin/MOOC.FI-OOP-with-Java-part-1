public class Main {
    public static void main(String[] args) {
        Counter counter  = new Counter(2, false);
        counter.decrease();
        counter.decrease();
        counter.decrease();
        System.out.println(counter.value());
    }
}
