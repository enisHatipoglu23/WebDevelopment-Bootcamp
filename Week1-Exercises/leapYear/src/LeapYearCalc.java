import java.util.Scanner;
public class LeapYearCalc {
    Scanner scanner = new Scanner(System.in);
    int year;

    void calc(){
        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır.");
                } else {
                    System.out.println(year + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }

    }


}
