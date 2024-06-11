import java.util.Scanner;
public class Taximeter {
    Scanner input = new Scanner(System.in);

    double price = 2.20,total;
    int startPrice = 10,minPrice = 20,distance;
    void calc(){
        System.out.print("Distance(KM): ");
        distance = input.nextInt();
        total = startPrice + (price * distance);
        total = (total < minPrice) ? minPrice : total;
        System.out.println("Total price: " + total + "₺");
    }
}
