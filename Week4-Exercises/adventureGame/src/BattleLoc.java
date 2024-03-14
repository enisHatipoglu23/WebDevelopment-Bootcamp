

import java.util.Random;

public class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(int id, Player player, String locationName, Monster monster, String award, int maxMonster) {
        super(id, player, locationName);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;

    }

    @Override
    public boolean onLocation() {
        int monsterNum = randomMonsterNum();
        System.out.println("Lokasyonunuz: " + this.getLocationName());
        System.out.println("Burada " + monsterNum + " tane " + this.getMonster().getMonsterName() + " yaşıyor.");
        System.out.println("<S>avaş mı <K>açmak mı? ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();

            if (selectCase.equals("S") && combat(monsterNum)){
                //Savaş işlemi
                return true;
            }

            if (this.getPlayer().getHealth() <= 0){
                System.out.println("YOU DIED ! ! ! :'( ");

                return false;
            }

        return true;
    }
    public boolean combat(int monsterNumber){
        for (int i = 1; i <= monsterNumber; i++){
            this.getPlayer().setHealth(this.getPlayer().getHealth());
            this.getMonster().setHealth(this.getMonster().getOriginalHealth());
            playerStats();
            monsterStats(i);
            while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0){
                System.out.println("<S>aldır veya <Kaç> : ");
                String selectMove = input.nextLine().toUpperCase();
                if (selectMove.equals("S")){
                    whoIsFirst();
                    if (whoIsFirst() >= 0 && whoIsFirst() < 50){
                        System.out.println("Siz vurdunuz . ");

                        this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                    }
                    if (whoIsFirst() >= 50 && whoIsFirst() < 100 && this.getMonster().getHealth() > 0){
                        System.out.println();
                        System.out.println(this.getMonster().getMonsterName() + " size vurdu! ");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getShield().getShieldDefence();
                        if (monsterDamage < 0){
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - this.getMonster().getDamage());
                        afterHit();
                    }

                }else{
                    System.out.println("You ran away like a coward :D hahahahaha. ");
                    return false;
                }

            }
            if (this.getMonster().getHealth() <= 0){
                System.out.println("Düşmanı yendiniz ! ! ! ");
                System.out.println(this.getAward() + " para kazandınız. ");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                System.out.println("Güncel paranız: " + this.getPlayer().getMoney());
            }else{
                System.out.println("You run ut like a coward :D hahahahaha. ");
                return false;
            }
        }
        System.out.println(this.getLocationName() + " lokasyonundaki tüm " + this.getMonster().getMonsterName() + " yaratıklarını yok ettiniz. ");
        return true;
    }
    public void afterHit(){
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getMonsterName() + " Canı: " + this.getMonster().getHealth());
    }
    public void playerStats(){
        System.out.println("Oyuncu Özellikleri: \n ----------" +
                "\nSağık : " + this.getPlayer().getHealth() +
                "\nHasar : " + this.getPlayer().getTotalDamage() + "\nPara : " + this.getPlayer().getMoney() +
                "\nSilah : " + this.getPlayer().getWeapon().getWeaponName() +
                "\nKalkan : " + this.getPlayer().getShield().getShieldName() +
                "\nBlock : " + this.getPlayer().getShield().getShieldDefence());
    }
    public void monsterStats(int i){
        System.out.println(i + "." + this.getMonster().getMonsterName() +" Canavar Özellikleri: \n ---------- \n " + "***" + this.getMonster().getMonsterName() + "***" +
                "\nSağık : " + this.getMonster().getHealth() +
                "\nHasar : " + this.getMonster().getDamage());    }

    public int randomMonsterNum(){
        Random random = new Random();
        return random.nextInt(this.getMaxMonster()) + 1;
    }
    public static int whoIsFirst(){
        int random = (int) (Math.random()  * 100);
        return random;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
