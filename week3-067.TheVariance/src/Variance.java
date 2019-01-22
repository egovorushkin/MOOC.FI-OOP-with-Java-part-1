import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {

        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {

        int count = 0;
        for (int i : list){
            count++;
        }
        return (double)sum(list) / count;
    }

    public static double variance(ArrayList<Integer> list) {
        double var;
        double a = 0;
        double avg = average(list);
        for (int i = 0; i < list.size(); i++) {
            a += Math.pow((list.get(i) - avg), 2);
        }
        var = a / (list.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println(average(list));

        System.out.println("The variance is: " + variance(list));
    }

}
