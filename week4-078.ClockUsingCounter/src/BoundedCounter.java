public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = value;
        this.upperLimit = upperLimit;
    }

    public void next(){
        value++;
        if (value > upperLimit){
            value = 0;
        }
    }

    @Override
    public String toString() {
        if(value < 10){
            return "0" + value;
        }else
            return "" + value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {

        if (value >= 0 && value <= 59 && value<= upperLimit) {
            this.value = value;
        } else
            value = 0;


    }

}
