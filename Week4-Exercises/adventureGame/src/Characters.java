public abstract class Characters {
        private String charName;
        private int damage;
        private int health;
        private int coin;


       public Characters(){

        }

        public Characters(String charName,int damage, int health, int coin) {
            this.charName = charName;
            this.damage = damage;
            this.health = health;
            this.coin = coin;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
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

    public void setCoin(int coin) {
        this.coin = coin;
    }
}
