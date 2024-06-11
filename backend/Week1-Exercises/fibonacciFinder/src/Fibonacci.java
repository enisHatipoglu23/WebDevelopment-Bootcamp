import java.util.Scanner;

public class Fibonacci {
    Scanner scan = new Scanner(System.in);
    int num, first=0, second=1, nextN;
    void func(){
        System.out.print("Enter a num: ");
        // sayı isteniyor.
        num = scan.nextInt();
        // hesaplama yapılıyor.
        int i = 0;
        while(i<num){
            System.out.print(first + " ");
            nextN = first + second; // 1
            first = second; // 1
            second = nextN; // 1
            i++;
        }
    }
}
