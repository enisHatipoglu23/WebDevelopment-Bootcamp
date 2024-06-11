public class Weapon {
    private String weaponName;
    private int weaponId;
    private int weaponDamage;
    private int weaponCost;

    public Weapon(String weaponName, int weaponId, int weaponDamage, int weaponCost) {
        this.weaponName = weaponName;
        this.weaponId = weaponId;
        this.weaponDamage = weaponDamage;
        this.weaponCost = weaponCost;
    }
    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("pistol", 1, 2, 5);
        weaponList[1] = new Weapon("sword", 2, 3, 35);
        weaponList[2] = new Weapon("rifle", 3, 7, 45);
        return weaponList;
    }

    public static Weapon getWeaponObjById(int id){
        for (Weapon w : weapons()){
            if (w.getWeaponId() == id){
                return w;
            }
        }
        return null;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getWeaponCost() {
        return weaponCost;
    }

    public void setWeaponCost(int weaponCost) {
        this.weaponCost = weaponCost;
    }
}
