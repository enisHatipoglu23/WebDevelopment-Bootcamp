import java.util.Scanner;
public class ReverseStar {
    Scanner scan = new Scanner(System.in);
    void func(){
        // İlk satırda 10 yıldız olduğundan 10 ile başlayıp giderek azalan bir for döngüsü kurdum.
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            // Yıldızların birer birer azalması için j>=i eşitliğini kurdum.
            for (int j = 10; j >=i ; j--) {
                System.out.print("*");
            }
        }
    }
}
