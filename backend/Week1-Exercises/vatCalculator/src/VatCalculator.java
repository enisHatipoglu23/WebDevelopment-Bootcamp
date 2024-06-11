import java.util.Scanner;
public class VatCalculator {
    //vat percent is %18
    Scanner input = new Scanner(System.in);
    double vat, total, percent = 0.18;
    void calc(){
        System.out.print("Amount: ");
        int amount = input.nextInt();

        vat = amount * percent;
        System.out.println("VAT amount: " + vat);

        total = vat + amount;
        System.out.println("Total amount(vat included): " + total);
    }


}
