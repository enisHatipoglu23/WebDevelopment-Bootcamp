import java.util.Scanner;
public class AwesomeNum {
    Scanner scan = new Scanner(System.in);
    int number, sum=0;
    void func(){
        System.out.println("Enter number: ");
        number = scan.nextInt();
        for (int i = 1; i < number; i++) {
            // tam bölünüyorsa o sayıyı ekle, tam bölünmüyorsa 0 eklettim ki sonucu etkilemesin.
            sum += (number%i==0) ? i : 0;
        }
        if(sum == number){
            System.out.println(number + " is a awesome number.");
        }else{
            System.out.println(number + " is not an awesome number. ");
        }
    }
}
