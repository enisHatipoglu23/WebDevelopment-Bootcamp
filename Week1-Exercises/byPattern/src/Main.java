import java.util.Scanner;

public class Main {
public static void operateNumber(int currentNum, int originalNum) {
    System.out.println("Current Number: " + currentNum);
    // check if number is negative
    if (currentNum <= 0) {
        currentNum += 5;
        System.out.println("Current Number: " + currentNum);
    }else{
        // minus 5 until number is negative
        operateNumber(currentNum - 5, originalNum);
    }
    currentNum += 5;
    // until start value, plus 5
    if (currentNum <= originalNum) {
        System.out.println("Current Number: " + currentNum);
    }
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        operateNumber(n,n);
    }
}