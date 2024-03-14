public class Inventory {
    private Weapon weapon;
    private Shield shield;

    public Inventory(){
       this.weapon = new Weapon("Punch", -1, 1, 0);
       this.shield = new Shield(-1, "Gard", 1, 0);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Shield getShield() {
        return shield;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }
}
