import java.util.ArrayList;
import java.util.List;

public class Products {
    double minCash;
    int number;

    public Products(double minCash, int number){
        this.number = number;
        this.minCash = minCash;
    }

    public double priceCalculation(){

        return minCash * number;
    }
}
