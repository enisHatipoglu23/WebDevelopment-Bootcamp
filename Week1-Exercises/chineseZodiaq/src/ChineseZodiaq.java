import java.util.Scanner;

public class ChineseZodiaq {
    Scanner scan = new Scanner(System.in);
    int year, zodiaq;

    void calc(){
        // Getting year variable using scanner.
        System.out.print("Enter a year: ");
        year = scan.nextInt();
        zodiaq = year % 12;
        switch (zodiaq){
            case 0:
                System.out.println("Your Chinese Zodiac Sign: Monkey" );
                break;
            case 1:
                System.out.println("Your Chinese Zodiac Sign: Cockerel" );
                break;
            case 2:
                System.out.println("Your Chinese Zodiac Sign: Dog" );
                break;
            case 3:
                System.out.println("Your Chinese Zodiac Sign: Pig" );
                break;
            case 4:
                System.out.println("Your Chinese Zodiac Sign: Mouse" );
                break;
            case 5:
                System.out.println("Your Chinese Zodiac Sign: Ox" );
                break;
            case 6:
                System.out.println("Your Chinese Zodiac Sign: Tiger" );
                break;
            case 7:
                System.out.println("Your Chinese Zodiac Sign: Bunny" );
                break;
            case 8:
                System.out.println("Your Chinese Zodiac Sign: Dragon" );
                break;
            case 9:
                System.out.println("Your Chinese Zodiac Sign: Snake" );
                break;
            case 10:
                System.out.println("Your Chinese Zodiac Sign: Horse" );
                break;
            case 11:
                System.out.println("Your Chinese Zodiac Sign: Sheep" );
                break;
        }


    }
}
