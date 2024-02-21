import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,result;

        //User input
        Scanner scan = new Scanner(System.in);
        System.out.println("a: ");
        a = scan.nextInt();
        System.out.println("b: ");
        b = scan.nextInt();
        System.out.println("c: ");
        c = scan.nextInt();

        result = a+b*c-b;
        System.out.println("Result: " + result);
    }
}