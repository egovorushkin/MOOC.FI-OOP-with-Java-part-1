public class Counter {

    int startingValue;
    boolean check;

    public Counter (int startingValue, boolean check){
        this.startingValue = startingValue;
        if (check == true){
            this.check = check;
        }
    }

    public Counter (int startingValue){
        this.startingValue = startingValue;
        this.check = false;
    }

    public Counter (boolean check){
        this.startingValue = 0;
        if (check == true) {
            this.check = check;
        }
    }

    public Counter(){
        this.startingValue = 0;
        this.check = false;
    }

    public int value(){
        return this.startingValue;
    }

    public void  increase(){
        this.startingValue++;
    }

    public void decrease(){

        if(this.check == true) {
            if (this.startingValue > 0){
                this.startingValue--;
            }
        }else if (this.check == false)
            this.startingValue--;

    }

    public void increase (int increaseAmount){
        if (increaseAmount >= 0){
            this.startingValue += increaseAmount;
        }else if(increaseAmount < 0){

        }
    }

    public void decrease(int decreaseAmount){
        if (decreaseAmount < 0){

        }else if(this.check == true){

            int temp = this.startingValue - decreaseAmount + this.startingValue;
            this.startingValue = temp;
        }else {
            this.startingValue -= decreaseAmount;
        }
    }

}
