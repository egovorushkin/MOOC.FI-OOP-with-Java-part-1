
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        amountOfNumbers = 0;
        sum = 0;
    }

    public void addNumber(int number){
        this.sum = sum + number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    public int sum(){
        return sum;
    }

    public double average() {
        if(this.amountOfNumbers == 0){
            return 0;
        }else
        return sum() / (double)this.amountOfNumbers();
    }
}
