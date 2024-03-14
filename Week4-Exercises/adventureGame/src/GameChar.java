public abstract class GameChar {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;
    private int originalHealth;
    public GameChar(int id, String name, int damage, int health, int money) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.money = money;

    }

    public int getId() {
        return id;
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
    public int getHealth() {
        return health;
    }


    public int getMoney() {
        return money;
    }

}
