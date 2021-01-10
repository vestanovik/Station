public class Technic extends Products {
    int power;

    public Technic(double minCash, int number, int power) {
        super(minCash, number);
        this.power = power;
    }

    @Override
    public double priceCalculation() {
        return super.priceCalculation() * power / 1000;
    }
}
