public class MainClass {
    public static void main(String[] args) {

        Shop shop = new Shop ("Star");

        shop.getProductsFromStorage();
        double dailyRevenue = shop.getDailyRevenue();
        System.out.println(dailyRevenue);
    }
}
