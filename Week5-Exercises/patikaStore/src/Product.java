public class Product {
    private static int idCounter = 1;
    private int id;
    private int price;
    private String name;
    private double discount;
    private int stock;
    private Brand brand;

    public Product(int price, String name, double discount, Brand brand) {
        this.id = idCounter++;
        this.price = price;
        this.name = name;
        this.discount = discount;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getStock() {
        return stock;
    }
}
