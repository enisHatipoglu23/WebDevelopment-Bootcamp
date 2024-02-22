import java.util.Scanner;

public class Fibonacci {
    Scanner scan = new Scanner(System.in);
    int num;
    void func(){
        System.out.print("Enter a num: ");
        // sayı isteniyor.
        num = scan.nextInt();
        // array tanımlanıyor.
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        int i = 2;
        while(i < num){
            // fibonacci formülü.
            arr[i] = arr[i-1] + arr[i-2];
            i++;
        }
        // array ekrana bastırlılıyor.
        for (int j = 0; j < num; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
