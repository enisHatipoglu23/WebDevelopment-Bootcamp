import java.util.Scanner;
public class ReverseStar {
    Scanner scan = new Scanner(System.in);
    int size;
    void func(){
        System.out.println("Enter size: ");
        size = scan.nextInt();
        // İlk satırda size değişkeni kadar yıldız olduğundan size ile başlayıp giderek azalan bir for döngüsü kurdum.
        for (int i = 1; i <= size; i++) {
            // Yıldızların birer birer azalması için j>=i eşitliğini kurdum.
            for (int j = size; j >=i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
