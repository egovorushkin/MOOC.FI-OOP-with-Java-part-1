
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added){
        Money newMoney = new Money(this.euros + added.euros, this.cents + added.cents);
        return newMoney;
    }

    public boolean less (Money compared){
        if(this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents)){
            return true;
        } else
            return false;
    }

    public Money minus (Money decremented){
        int newCents = this.cents() - decremented.cents();
        int newEuros = this.euros() - decremented.euros();

        if (this.cents() - decremented.cents() < 0) {
            newEuros -= 1;
            newCents += 100;
        }

        Money newMoney = new Money(newEuros, newCents);

        if (newMoney.euros() < 0) {
            Money zeroMoney = new Money(0, 0);
            newMoney = zeroMoney;
        }

        return newMoney;
    }

}
