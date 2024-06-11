import java.util.Random;
public class Monster {

    private int id;
    private String monsterName;
    private int damage;
    private int health;
    private int award;
    private int originalHealth;



    public Monster(int id, String monsterName, int damage, int health, int award) {
        this.id = id;
        this.monsterName = monsterName;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.award = award;
    }

    public static Monster[] monsters(){
        Monster[] monsterList = new Monster[4];
        monsterList[0] = new Monster(1, "Zombie", 3, 10,4);
        monsterList[1] = new Monster(2,"Vampire", 4, 14,6);
        monsterList[2] = new Monster(3, "Bear", 7, 20,8);
        monsterList[3] = new Monster(4, "Snake", snakeDamage(), 20,8);
        return monsterList;
    }
    public static int snakeDamage(){
        Random random = new Random();
        int maxDamage = 6;
        return random.nextInt( maxDamage) + 1;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        if (health < 0){
            health = 0;
        }
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }
}
