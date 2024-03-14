public class Forest extends Location{

    public Forest(Player player) {
        super(player, "Forest", new Wolf(),3);
    }

    @Override
    boolean onLocation() {
        System.out.println("you are in a dark, foggy forest. you're lucky there's a full moon.");
        System.out.println("there are " + this.randomEnemy() + " number of wolfs around you.");
        return true;
    }
}
