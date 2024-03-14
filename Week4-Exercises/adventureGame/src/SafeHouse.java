public class SafeHouse extends Location{
    public SafeHouse(Player player) {
        super(player, "Safe house", null, 0);
    }

    @Override
    boolean onLocation() {
        System.out.println("o> you are in the safe house now.\trelax." +
                "Health: " + player.getHealth() + "\t your health has been fulled. <o");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());

        return true;
    }
}
