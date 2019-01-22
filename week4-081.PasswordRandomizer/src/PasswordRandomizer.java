import java.util.Random;

public class PasswordRandomizer {
    int length;
    Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        char symbol;
        String passw = "";
        for (int i = 0; i < this.length; i++) {
            int num = random.nextInt(26);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(num);
            passw += symbol;
        }
        return passw;
    }
}
