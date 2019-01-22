import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int num = 0;
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            num = list.get(i);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(-2);
        lista.add(-1);
        lista.add(-3);

        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}