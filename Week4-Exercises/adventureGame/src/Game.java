import java.util.Scanner;

public class Game {
    private String name;
    Location location = null;
    Scanner scanner = new Scanner(System.in);
    public void start(){
        slowMotion("..........|WELCOME|..........",4);
        slowMotion("\no> how about some adventure ?\ndon't be afraid, go ahead. <o",4);
        while(true){
            slowMotion("\no> what is your name ? <o (if you're a coward, type i'm coward and go.) ↓\n", 4);

            name = scanner.nextLine();
            if(name.equalsIgnoreCase("i'm coward")){
                System.out.println("bye coward."); break;
            }

            Player player = new Player(name);
            System.out.println("\no> hi " + player.getName() + " <o");
            System.out.println("\no> time to chose your player. <o");
            player.selectChar();

            player =;
            slowMotion("where do u wanna go?\n",25);
            Forest forest = new Forest(player);
            Ocean ocean = new Ocean(player);
            SafeHouse safeHouse = new SafeHouse(player);
            Location[] locations = {forest, ocean, safeHouse};
            int i = 1;
            for (Location loc : locations){
                System.out.println((i + ".\t" + loc.getName()));
                i++;
            }
            System.out.println((i + ". " + "Exit"));
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    System.out.println(forest.getName());
                    this.location = forest;
                    break;
                case 2:
                    System.out.println(ocean.getName());
                    this.location = ocean;
                    break;
                case 3:
                    System.out.println(safeHouse.getName());
                    this.location = safeHouse;
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            this.location.onLocation();
            player.combat();
        }

    }

        public void selectLocation(){
        Player player=null;
        Forest forest = new Forest(player);
        Ocean ocean = new Ocean(player);
        SafeHouse safeHouse = new SafeHouse(player);
        Location[] locations = {forest, ocean, safeHouse};
        int i = 1;
        for (Location loc : locations){
            System.out.println((i + ".\t" + loc.getName()));
            i++;
        }
        System.out.println((i + ". " + "Exit"));
        int selection = scanner.nextInt();
        switch (selection){
            case 1:
                System.out.println(forest.getName());
                this.location = forest;
                break;
            case 2:
                System.out.println(ocean.getName());
                this.location = ocean;
                break;
            case 3:
                System.out.println(safeHouse.getName());
                this.location = safeHouse;
                break;
            case 4:
                break;
            default:
                break;
        }
        this.location.onLocation();
    }

    public void slowMotion(String text, int speed){
        try{
            for (char letter : text.toCharArray()){
                System.out.print(letter);
                Thread.sleep(speed);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
