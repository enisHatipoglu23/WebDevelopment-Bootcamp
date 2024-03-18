import java.util.Scanner;

public class Main {
    public static void isOutOfBound() throws OutOfBoundsException{
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of the index you want to see ↓");
        int num = scanner.nextInt();
        if(num >= arr.length || num < 0){
            throw new OutOfBoundsException("The number is out of the array.");
        }
        System.out.println("Num: " + arr[num]);
    }
    public static void main(String[] args) {
        try{
            isOutOfBound();
        }catch (OutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}