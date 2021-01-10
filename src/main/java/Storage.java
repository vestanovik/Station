import java.util.ArrayList;
import java.util.List;

public class Storage {
//    int totalProductNumber;
    public List<Products> getProducts(int productNumberToShop){
        List<Products> products = new ArrayList<>();
        Fruits fruits = new Fruits(1.5, productNumberToShop,2);
        Clothes clothes = new Clothes(2,productNumberToShop,46);
        Technic technic = new Technic(25,productNumberToShop,5000);
        products.add(fruits);
        products.add(clothes);
        products.add(technic);
        return products;
    }
}
