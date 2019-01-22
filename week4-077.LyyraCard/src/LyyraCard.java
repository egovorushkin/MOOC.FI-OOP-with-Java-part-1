public class LyyraCard {
    private double balance;


    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical(){
        if(this.balance >= 2.50)
            this.balance = this.balance - 2.50;
    }

    public void payGourmet(){
        if(this.balance >= 4.00) {
            this.balance = this.balance - 4.00;
        } else if (this.balance < 0){
            this.balance = this.balance;
        }
    }

    public void loadMoney(double amount){
        if (amount < 0){
            this.balance = this.balance + 0;

        }else  if (amount > 0) {
            this.balance = this.balance + amount;
        }
        if (this.balance > 150){
            double temp = this.balance - 150;
            this.balance = this.balance - temp;
        }


    }
}
