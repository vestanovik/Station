public class Clothes extends Products {
    int size;

    public Clothes(double minCash, int number, int size) {
        super(minCash, number);
        this.size = size;
    }

    @Override
    public double priceCalculation() {
        return super.priceCalculation() * size;
    }
}
