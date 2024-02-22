import java.util.Scanner;

public class Finder {
    Scanner scan = new Scanner(System.in);
    int n;
    void find(){
        System.out.println("How many numbers you want to enter?");
        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println((i+1) + ". Number: ");
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n ; i++) {
            if(arr[i] > max){
                max = arr[i];
                System.out.println("Maximum number is " + max);
            }
            if(arr[i] < min){
                min = arr[i];
                System.out.println("Minimum number is " + min);
            }
        }
    }
}
