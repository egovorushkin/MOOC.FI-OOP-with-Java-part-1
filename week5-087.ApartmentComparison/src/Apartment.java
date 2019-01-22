
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartmment){
        if(this.squareMeters > otherApartmment.squareMeters) {
            return true;
        }else
            return false;
    }

    public int priceDifference(Apartment otherApartmment){
        if ((otherApartmment.pricePerSquareMeter * otherApartmment.squareMeters) >
                this.pricePerSquareMeter * this.squareMeters) {
            return (otherApartmment.pricePerSquareMeter * otherApartmment.squareMeters) -
                    (this.pricePerSquareMeter * this.squareMeters);
        } else
            return (this.pricePerSquareMeter * this.squareMeters) -
                    (otherApartmment.pricePerSquareMeter * otherApartmment.squareMeters);
    }

    public boolean moreExpensiveThan(Apartment otherApartmment){
        if ((this.squareMeters * this.pricePerSquareMeter) >
                (otherApartmment.squareMeters * otherApartmment.pricePerSquareMeter)){
            return  true;
        }else
            return false;
    }

}
