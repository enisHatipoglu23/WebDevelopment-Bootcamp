import java.util.Scanner;
public class FlightTicket {
    // Defined variables. I added discount variables too. It's more understandable this way.
    // I tried to use different conditional operators on this code. (if-else, switch-case, ternary-operator).
    double km, pricePerKm = 0.10, totalPrice, price, rtDiscount=0.8,
            childDiscount=0.5, teenagerDiscount = 0.9, oldDiscount = 0.8;
    int age, ticketType;
    final String WELCOME = "-----Welcome to Flight Ticket Calculator-----\n";
    Scanner scan = new Scanner(System.in);

    void ticketCalc(){
        System.out.println(WELCOME);
        // Getting trip distance from user.
        System.out.print("Enter the distance: ");
        km = scan.nextDouble();

        // Checking if distance is negative or too big number. If distance is too big or negative it returns the function again.
        if ((km > 0) && (km <= 100000)) {
            price = km * pricePerKm;
            System.out.print("Enter your age: ");
            age = scan.nextInt();
            // Checking if age input is invalid or ok. If it's invalid it returns the function again.
            if(age>0 && age<121){
                // Calculating price according to age. Ternary operator used.
                price = (age < 12) ? (price * childDiscount) : age < 24 ? (price * teenagerDiscount)
                        : (age >= 65) ? (price * oldDiscount) : price;

                System.out.println("Select ticket type:\n1) One-Way \t 2) Round-Trip");
                ticketType = scan.nextInt();

                //Using switch-case for selecting the type of ticket.
                switch (ticketType){
                    case 1 :
                        totalPrice = price;
                        System.out.println("You selected One-Way ticket.\nTotal price is " + totalPrice + "₺");

                        break;
                    case 2 :
                        // Multiplying the price by 2 due to round trip.
                        totalPrice = (price*2*rtDiscount);
                        System.out.println("You selected Round-Trip ticket.\n" +
                                "Because of selecting round-trip, we have a special %20 discount for you.\n" +
                                "Total price is " + totalPrice + "₺");
                        break;
                    default:
                        System.out.println("Invalid number: " + ticketType + "\nPlease start all over again.\n");
                        // Calling the function again because of the invalid number.
                        ticketCalc();
                }
            }else{
                // Calling the function again because of the invalid age.
                System.out.println("Invalid input: " + age + "\nPlease try again.\n");
                ticketCalc();
            }
        }else{
            // Calling the function again because of the invalid km input.
            System.out.println("Invalid input: " + km + "\nPlease try again.\n");
            ticketCalc();
        }


    }
}
