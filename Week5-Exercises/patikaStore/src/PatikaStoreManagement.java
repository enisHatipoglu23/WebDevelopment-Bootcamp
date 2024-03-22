import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class PatikaStoreManagement {
    private List<Brand> brands;
    private List<Product> products;
    Scanner scanner = new Scanner(System.in);
    private final String[] defaultBrands = {"Samsung", "Lenovo", "Apple",
            "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};

    // for user interaction
    int price;
    String name;
    double discount;
    int brandId;
    int ram;
    int storage;
    double screenSize;
    String memory;
    int battery;
    // .

    public PatikaStoreManagement() {
        this.brands = new ArrayList<>();
        this.products = new ArrayList<>();
        // adding default brands to the ArrayList
        for (int i = 1; i<=defaultBrands.length;i++) {
            brands.add(new Brand(defaultBrands[i-1]));
        }
    }

    public void getBrands(){
        brands.sort(Comparator.naturalOrder());
        brands.forEach(brand -> System.out.println("Brand id: " + brand.getId() + "\nBrand name: " + brand.getName() +
                "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"));
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(int productID){
        products.removeIf(product -> (product.getId() == productID));
    }

    public void listAllProducts(){
        for (Product product : products) {
            System.out.println("+------------+----------------------+----------------+------------+------------+------------+");
            System.out.println("| Ürün ID    | Ürün Adı             | Marka Adı      | Fiyat      | İndirim ");
            System.out.println("+------------+----------------------+----------------+------------+------------+------------+");
            System.out.print("| ");
            System.out.print(String.format("%-10d", product.getId()) + " | ");
            System.out.print(String.format("%-20s", product.getName()) + " | ");
            System.out.print(String.format("%-14s", product.getBrand().getName()) + " | ");
            System.out.print(String.format("%-10d", product.getPrice()) + " | ");
            System.out.print(String.format("%-10d", (int) product.getDiscount()) + " |\n");

            System.out.println("+------------+----------------------+----------------+------------+------------+------------+");
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void listProductsByBrand(int brandId){
        for (Product product : products){
            if (brandId == product.getBrand().getId()){
                System.out.println("| Ürün ID | Ürün Adı                    | Marka Adı | Fiyat   | İndirim | Stok |");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.print("| " + product.getId() + "        | ");
                System.out.print(product.getName() + "            | ");
                System.out.print(product.getBrand().getName() + "     | ");
                System.out.print(product.getPrice() + "      | ");
                System.out.print(product.getDiscount() + "        | ");
                System.out.print(product.getStock() + "    |\n");

            }
        }
//        products.forEach(product -> System.out.println(product.getBrand().getId() == brandId) );
    }


    public void management(){
        System.out.println(" WELCOME TO Patika-Store ");
        System.out.println("Mağazamızda ürününü ekleyebileceğiniz markalar ↓");
        this.getBrands();
        while(true){
            System.out.println("1- ADD PRODUCT");
            System.out.println("2- LIST PRODUCTS");
            System.out.println("3- REMOVE PRODUCT");
            System.out.println("4- GET BRANDS PRODUCTS");
            System.out.println("5- QUIT");
            System.out.println("Select: ");
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.println(" Categories ↓");
                    System.out.println("1- Notebook's\t2- Mobile Phone's");
                    System.out.println("Which category: ");

                    int selection = scanner.nextInt();
                    if (selection == 1){
                        inputFeature(selection);

                        addProduct(new Notebook(price,name,discount,selectBrand(brandId),ram,storage,screenSize));
                    }else if(selection == 2){
                        inputFeature(selection);
                        addProduct(new MobilePhone(price, name, discount, selectBrand(brandId),memory, screenSize, battery, ram ));
                }
                    break;
                case 2:
                    listAllProducts();
                    break;
                case 3:
                    System.out.println("Enter the product id: ");
                    int productId = scanner.nextInt();
                    removeProduct(productId);
                    break;
                case 4:
                    System.out.println("Enter the brand id: ");
                    int brandId = scanner.nextInt();
                    listProductsByBrand(brandId);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    public void inputFeature(int s){

        System.out.println("Ürününüzün fiyatı: ");
        price = scanner.nextInt();


        System.out.println("Ürünün adı: ");
        name = scanner.next();

        System.out.println("Ürünün indirim oranı: ");
        discount = scanner.nextDouble();


        System.out.println("Ürününü eklemek istediğiniz markanın id'sini giriniz: ");
        brandId = scanner.nextInt();


        System.out.println("Ram: ");
        ram = scanner.nextInt();

        System.out.println("Screen size: ");
        screenSize = scanner.nextDouble();

        if(s == 1){
            System.out.println("Storage: ");
            storage = scanner.nextInt();
        } else if (s == 2) {
            System.out.println("Memory: ");
            memory = scanner.next();
            System.out.println("Battery: ");
            battery = scanner.nextInt();
        }

    }
    public Brand selectBrand(int id){
        for(Brand brand : brands){
            if(brand.getId() == id){
                return brand;
            }
        }
        return null;
    }


}