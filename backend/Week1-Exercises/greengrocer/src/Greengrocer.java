import java.util.Scanner;
public class Greengrocer {
    // Variable definition.
    double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;
    // Defining prices per kilogram for each variable.
    double pearPricePerKg = 2.14, applePricePerKg=3.67, tomatoPricePerKg=1.11, bananaPricePerKg=0.95, eggplantPricePerKg=5.00;

    double result;
    final String welcome = "--Welcome to the Java Greengrocer--";
    Scanner scan = new Scanner(System.in);
    void func(){
        System.out.println(welcome);
        // Getting input from user for each variable to calculate total amount.
        System.out.print("How many kilos of pear's: ");
        pearKg = scan.nextDouble();

        System.out.print("How many kilos of apple's: ");
        appleKg = scan.nextDouble();

        System.out.print("How many kilos of tomato's: ");
        tomatoKg = scan.nextDouble();

        System.out.print("How many kilos of banana's: ");
        bananaKg = scan.nextDouble();

        System.out.print("How many kilos of eggplant's: ");
        eggplantKg = scan.nextDouble();

        result += (pearKg*pearPricePerKg + appleKg*applePricePerKg + tomatoKg*tomatoPricePerKg
                + bananaKg*bananaPricePerKg + eggplantKg*eggplantPricePerKg);

        System.out.println("Total amount: " + result);
    }
}
