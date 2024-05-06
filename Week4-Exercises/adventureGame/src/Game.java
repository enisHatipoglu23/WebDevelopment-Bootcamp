
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    public void start() {
        this.slowMotion("the Adventure game has been started!\n",100);
        this.slowMotion("please input your username down there ↓ \n",80);

        String userName = input.nextLine();

        Player player = new Player(userName);

        this.slowMotion("welcome to the adventure Game " + userName + "\n",30);

        player.selectChar();
        Location location = null;
        while (true) {

            Location[] normalLocs = {new SafeHouse(player), new ToolStore(player) {
            }};
            slowMotion("locations:\n",60);
            int count = 1;
            for (Location locChar : normalLocs) {
                slowMotion(count + "- " + locChar.getLocationName()+"\n",60);
                count++;
            }
            BattleLoc[] battleLocs = {new Cave(player), new Woods(player), new River(player), new Maden(player)};
            int count2 = 3;
            for (BattleLoc battleChar : battleLocs) {
                System.out.println(count2 + "- " + battleChar.getLocationName() + " reward= " + battleChar.getAward());
                count2++;
            }
            System.out.println("to exit ==> 0");
            System.out.println("choose  location => ");

            int locChoose = input.nextInt();
            while (locChoose < 0 || locChoose > (normalLocs.length + battleLocs.length)) {
                System.out.println("invalid value. ");
                locChoose = input.nextInt();
            }


            switch (locChoose) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Woods(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Maden(player);
                    break;
                default:
                    System.out.println("choose one of our sections. ");
            }
            if (location == null) {
                System.out.println("bye ");
                break;
            }
            if (location.onLocation() == false) {
                System.out.println("***");
                break;

            }
        }
    }
    public void slowMotion(String text, int speed){
        try {
            for (int i = 0; i<text.length();i++){
                System.out.print(text.charAt(i));
                Thread.sleep(speed);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}



