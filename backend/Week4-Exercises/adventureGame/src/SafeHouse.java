
public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(1, player, "Safe House ");
    }


    @Override
    public boolean onLocation() {
        System.out.println("You're at Safe House. ");

        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Your stamina has been fulled. " + this.getPlayer().getOriginalHealth());
        return true;
    }
}
