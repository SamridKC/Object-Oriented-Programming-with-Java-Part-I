
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if(this.squareMeters >= otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        int thisApartmentPrice = this.pricePerSquareMeter * this.squareMeters;
        int parameterAppartmentPrice = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;

        return Math.abs(thisApartmentPrice - parameterAppartmentPrice);

    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if((this.pricePerSquareMeter*this.squareMeters)>=(otherApartment.pricePerSquareMeter*otherApartment.squareMeters)) {
            return true;
        }
        return false;
    }
}
