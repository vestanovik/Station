import java.util.List;

public class Cashier {
    public double revenueCalculation(List<Products> products){
        double totalSum = 0;
        for (Products product: products){
            totalSum= totalSum + product.priceCalculation();
        }
        return totalSum;
    }
}
