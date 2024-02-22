import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type integer number. Get double output: ");
        double number = (int) scan.nextDouble();
        System.out.println(number);

        System.out.println("Type integer get float: ");
        float num = (int) scan.nextFloat();
        System.out.print(num);

    }
}