import java.util.Random;

public abstract class Location {
    Player player;
    private String name;

    private Enemy enemy;
    private int maxEnemy;
    private int enemyCount;
    private Game game;
    public Game getGame() {
        return game;
    }
    public Location(Player player, String name, Enemy enemy, int maxEnemy) {
        this.player = player;
        this.name = name;
        this.maxEnemy = maxEnemy;
    }

    public int randomEnemy(){
        Random random = new Random();
        enemyCount = random.nextInt(3)+1;
        return enemyCount;
    }

    public int getEnemyCount() {
        return enemyCount;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    abstract boolean onLocation();

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
