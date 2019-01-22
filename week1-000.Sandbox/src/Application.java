// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");


        String str = list.get(0);

        System.out.println(str.length());
    }
}
