public class Shield {
    private int shieldId;
    private String shieldName;
    private int shieldDefence;
    private int shieldCost;

    public Shield(int shieldId, String shieldName, int shieldDefence, int shieldCost) {
        this.shieldId = shieldId;
        this.shieldName = shieldName;
        this.shieldDefence = shieldDefence;
        this.shieldCost = shieldCost;
    }

    public static Shield[] shields() {
        Shield[] shieldList = new Shield[3];
        shieldList[0] = new Shield(1, " Hafif ", 1, 10);
        shieldList[1] = new Shield(2, " Orta ", 3, 15);
        shieldList[2] = new Shield(3, " Ağır ", 5, 20);

        return shieldList;
    }

    public static Shield shieldObjId(int id) {
        for (Shield shieldBuy : shields()) {
            if (shieldBuy.getShieldId() == id) {
                return shieldBuy;
            }
        }
        return null;
    }

    public int getShieldId() {
        return shieldId;
    }

    public void setShieldId(int shieldId) {
        this.shieldId = shieldId;
    }

    public String getShieldName() {
        return shieldName;
    }

    public void setShieldName(String shieldName) {
        this.shieldName = shieldName;
    }

    public int getShieldDefence() {
        return shieldDefence;
    }

    public void setShieldDefence(int shieldDefence) {
        this.shieldDefence = shieldDefence;
    }

    public int getShieldCost() {
        return shieldCost;
    }

    public void setShieldCost(int shieldCost) {
        this.shieldCost = shieldCost;
    }
}
