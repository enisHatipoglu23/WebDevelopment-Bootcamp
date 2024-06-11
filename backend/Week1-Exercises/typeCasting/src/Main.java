import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int intNum = scan.nextInt();

        System.out.println("Enter a decimal number: ");
        double decimalNum = scan.nextDouble();

        double newDecimalNum = intNum; // auto widenning
        int newIntNum = (int) decimalNum; // explicit narrowing

        System.out.println("int to double: " + newDecimalNum + "\ndouble to int: " + newIntNum);

    }
}