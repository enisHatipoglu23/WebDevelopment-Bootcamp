import java.util.Scanner;

public class Fibonacci {
    Scanner scan = new Scanner(System.in);
    int num, first=0, second=1, nextN;
    void func(){
        System.out.print("Enter a num: ");
        // sayı isteniyor.
        num = scan.nextInt();
        // hesaplama yapılıyor.
        for (int i = 0; i < num; i++) {
            System.out.print(first + " "); // 0 1 1 2 3
            nextN = first + second; // 1
            first = second; // 1
            second = nextN; // 1
        }
    }
}
