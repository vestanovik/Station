public class Fruits extends Products{
   double weight;

    public Fruits(double minCash, int number,double weight) {
        super(minCash, number);
        this.weight = weight;
    }


    @Override
    public double priceCalculation() {
        return super.priceCalculation() * weight;
    }
}
