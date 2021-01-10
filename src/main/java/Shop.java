import java.util.List;

public class Shop {
    String name;
    List<Products> products ;
    public Shop (String name){
        this.name = name;
    }

    public void getProductsFromStorage() {
         Storage storage = new Storage();
         this.products = storage.getProducts(35);
    }


    public double getDailyRevenue() {
        Cashier cashier = new Cashier();
        return cashier.revenueCalculation(this.products);
    }
}
