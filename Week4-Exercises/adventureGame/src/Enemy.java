import java.util.Random;

public abstract class Enemy {
    private int damage;
    private int health;

    private int reward;
    public Enemy(int damage, int health, int reward) {
        this.damage = damage;
        this.health = health;
        this.reward = reward;
    }




    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
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
}
