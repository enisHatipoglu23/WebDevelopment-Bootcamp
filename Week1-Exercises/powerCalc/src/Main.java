import java.util.Scanner;

public class Main {
    // to use Scanner in a static method, i used static.
    static Scanner scan = new Scanner(System.in);

    // calculation method.
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b ; i++) {
            result *= a;
        }
        return result;
    }
    // main method
    public static void main(String[] args){
        System.out.println("Enter first and second number: ");
        int  a = scan.nextInt();
        int b = scan.nextInt();
        int result = power(a,b);
        System.out.println("Result: " + result);
    }
}