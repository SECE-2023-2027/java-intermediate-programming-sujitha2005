import java.util.Scanner;

class Product {
    private String productId, productName;
    private double price;
    private int stockQuantity;

    Product(String id, String name, double price, int stock) {
        this.productId = id;
        this.productName = name;
        this.price = (price < 0) ? 0.0 : price;
        this.stockQuantity = (stock < 0) ? 0 : stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void applyDiscount(double per) {
        price = price - (price * per / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p = new Product(
                sc.next(), 
                sc.next(), 
                sc.nextDouble(), 
                sc.nextInt()
        );

        p.applyDiscount(sc.nextDouble());

        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());
    }
}