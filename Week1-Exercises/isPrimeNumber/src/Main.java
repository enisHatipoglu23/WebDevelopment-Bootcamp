import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int div) {
        // Checking if number
        if(number <= 2){
            return number == 2 ? true : false;
        }
        if(number % div == 0){
            return false;
        }
        // if power of div greater than the number that means there is no divisor anymore.
        if(div*div > number){
            return true;
        }
        // checking for the next divisor
        return isPrime(number, div+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = scan.nextInt();
        // div should start at 2 bc all numbers can be divided to 1.
        if (isPrime(number, 2))
            System.out.println("It's Prime: " + number);
        else
            System.out.println("Not a Prime: " + number);
    }
}