import java.util.Scanner;
public class BodyMassIndex {
    double weight, height, bodyIndex;
    Scanner scan = new Scanner(System.in);
     void bmiCalc(){
        System.out.println("Enter your height: ");
        height = scan.nextDouble();
         System.out.println(height);

        System.out.println("Enter your weight: ");
        weight = scan.nextDouble();

        bodyIndex = (weight / (height*height));

        System.out.println("Your body index is " + bodyIndex + ".");

        if(bodyIndex <= 18.5){
            System.out.println("-Weak.\n-You should gain weight.");
        }else if(bodyIndex >= 18.5 && bodyIndex <= 24.9){
            System.out.println("-Normal body mass index.");
        }else if(bodyIndex >= 25){
            System.out.println("-Overweight.\n-You should start exercising.");
        }
    }





}
