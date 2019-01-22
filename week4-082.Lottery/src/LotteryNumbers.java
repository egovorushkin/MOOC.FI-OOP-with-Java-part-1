import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random  random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()

        int randomNumber;
        while (this.numbers.size() < 7) {
            randomNumber = random.nextInt(39) + 1;
            if (!containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            }
        }

    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        } else
            return false;
    }
}
