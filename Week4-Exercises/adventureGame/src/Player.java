import java.util.Scanner;

public class Player extends Game{

    private String name;
    private int damage;
    private int health;
    private int originalHealth;
    private int coin;
    private String charName;
    Characters character;
    Location location;
    Scanner scanner = new Scanner(System.in);

    Player(){

    }

    public Player(String name) {
        this.name = name;
    }

    public void selectChar(){
        System.out.println("Characters ↓ ");
        Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight = new Knight();

        Characters[] charactersList = {samurai, archer, knight};
        int i = 1;
        for (Characters list : charactersList){
            System.out.println((i) + "." + list.getCharName() + " | damage: " + list.getDamage() + "\thealth: " +  list.getHealth() + "\tcoin: " + list.getCoin());
            i++;
        }
        System.out.println((i) + ". EXIT");
        System.out.println("Select one: ");

        int selection = scanner.nextInt();
        switch (selection){
            case 1:
                System.out.println("You chose " + samurai.getCharName());
                character = samurai;
                match(character);
                break;
            case 2:
                System.out.println("You chose " + archer.getCharName());
                character = archer;
                match(character);
                break;
            case 3:
                System.out.println("You chose " + knight.getCharName());
                character = knight;
                match(character);
                break;
                case 4:
                System.out.println("bye coward.");
                break;

            default:
                System.out.println("You entered a value outside the range.\nValue must be between 1-3");
                selectChar();
        }
        System.out.println(this.getCharName() + " | damage = " + this.getDamage() + " | health = " +
                this.getHealth() + " | coin = " + this.getCoin());
    }

//    public void selectLocation(){
//        Forest forest = new Forest(player);
//        Ocean ocean = new Ocean(player);
//        SafeHouse safeHouse = new SafeHouse(player);
//        Location[] locations = {forest, ocean, safeHouse};
//        int i = 1;
//        for (Location loc : locations){
//            System.out.println((i + ".\t" + loc.getName()));
//            i++;
//        }
//        System.out.println((i + ". " + "Exit"));
//        int selection = scanner.nextInt();
//        switch (selection){
//            case 1:
//                System.out.println(forest.getName());
//                this.location = forest;
//                break;
//            case 2:
//                System.out.println(ocean.getName());
//                this.location = ocean;
//                break;
//            case 3:
//                System.out.println(safeHouse.getName());
//                this.location = safeHouse;
//                break;
//            case 4:
//                break;
//            default:
//                break;
//        }
//        this.location.onLocation();
//    }

    public void combat(){
        System.out.println("are you gonna <f>ight or <r>un (press f to fight - press r tu run)");
        String selection = scanner.next();
        if(selection.equalsIgnoreCase("f")){

        }else if(selection.equalsIgnoreCase("r")){
            System.out.println("haha coward.\twhere do you wanna go this time?");
//            this.selectLocation();
        }
    }



    public void match(Characters characters){
        this.setCharName(this.getCharacter().getCharName());
        this.setDamage(this.getCharacter().getDamage());
        this.setHealth(this.getCharacter().getHealth());
        this.setOriginalHealth(this.getCharacter().getHealth());
        this.setCoin(this.getCharacter().getCoin());
       }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public Characters getCharacter() {
        return character;
    }

    public void setCharacter(Characters character) {
        this.character = character;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}



































