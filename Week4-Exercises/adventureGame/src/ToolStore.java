

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(2, player, "Tool Store ");
    }
    Weapon weapon = null;
    Shield shield = null;
    int wallet = this.getPlayer().getMoney();
    @Override
    public boolean onLocation() {
        System.out.println("---- Welcome to the Tool Store. ----");
        boolean showMenu = true;
        while(showMenu){
            System.out.println("1- Weapons\n2- Shields\n3- Exit");
            int selectTool = input.nextInt();
            while(selectTool < 1 || selectTool > 3){
                System.out.println("Invalid input! ");
                selectTool = input.nextInt();
            }
            switch (selectTool){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printShield();
                    buyShield();

                    break;
                case 3:
                    System.out.println(" Come again! ");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }
    public void printWeapon(){

        System.out.println("^^ Weapons ^^");
        for (Weapon weaponListing:Weapon.weapons()
             ) {
            System.out.println(weaponListing.getWeaponId() + "- Weapoon Name: " + weaponListing.getWeaponName() +
                    " Weapon Damage: " + weaponListing.getWeaponDamage() + " Weapon Cost: " + weaponListing.getWeaponCost());
        }
        System.out.println("Çıkış yapmak için ==> 0");

        }
    public void buyWeapon(){
        int selectWeaponID = input.nextInt();
        while(selectWeaponID < 0  ||selectWeaponID > Weapon.weapons().length){
            System.out.println("Invalid value. ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if (selectedWeapon != null){
                if (selectedWeapon.getWeaponCost() > this.getPlayer().getMoney()){
                    System.out.println("Paranız bu silahı almak için yeterli değil. " +
                            "Wallet: " +this.getPlayer().getMoney());
                }else{
                    //SATIN ALMA
                    System.out.println(selectedWeapon.getWeaponName() + " silahını satın aldınız. ");

                    wallet -= selectedWeapon.getWeaponCost();
                    this.getPlayer().setMoney(wallet);
                    System.out.println("Wallet: " + wallet);
                    String previosWeopen = this.getPlayer().getInventory().getWeapon().getWeaponName();
                    System.out.println("Previos weapon: " + previosWeopen);
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                    String newWeapon = this.getPlayer().getInventory().getWeapon().getWeaponName();
                    System.out.println("New weapon: " + newWeapon + " Damage: " + this.getPlayer().getTotalDamage() + " Wallet: " + wallet);

                }
        }


        }
        /*Weapon[] weapons = {new Pistol(), new Sword(), new Gun()};
        for (Weapon weaponChs:weapons
             ) {
            System.out.println(weaponChs.getWeaponId() + "- " + "Weapon Name: " + weaponChs.getWeaponName() + " Weapon Damage: " + weaponChs.getWeaponDamage()
            + " Weapon Cost: " + weaponChs.getWeaponCost());
        }
        System.out.println("Please choose what weapon do you want. ");
        int weaponSelect = input.nextInt();
        while(weaponSelect < 1 || weaponSelect > weapons.length){
            System.out.println("Invalid input! ");
            weaponSelect = input.nextInt();
        }
        switch (weaponSelect){
            case 1:
                weapon = new Pistol();
                break;
            case 2:
                weapon = new Sword();
                break;
            case 3:
                weapon = new Gun();
                break;
            default:
                System.out.println("please choose one of them. ");

        }
        System.out.println("You picked " + weapon.getWeaponName());

         */
    }
    public void printShield() {
        System.out.println("^^ Shields ^^");
        for(Shield shielPrint : Shield.shields()){
            System.out.println(shielPrint.getShieldId() + "- Shield Name: " + shielPrint.getShieldName() +
                    " Shield Defence: " + shielPrint.getShieldDefence() + " Shiel Cost: " + shielPrint.getShieldCost());
        }
        System.out.println("Çıkış yapmak için ==> 0");
    }

    public void buyShield(){
        int selectShieldId = input.nextInt();
        while(selectShieldId < 0 || selectShieldId > Shield.shields().length){
            System.out.println("Invalid value. ");
            selectShieldId = input.nextInt();
        }
        if (selectShieldId != 0){
            Shield selectedShield = Shield.shieldObjId(selectShieldId);
            if (selectedShield != null){
                if (selectedShield.getShieldCost() > wallet){
                    System.out.println("Paranız bu korumayı almaya yeterli değil. " + " Wallet : " + wallet);
                }else{
                    //SATIN ALMA
                    System.out.println(selectedShield.getShieldName() + " satın aldınız. ");
                    wallet -= selectedShield.getShieldCost();
                    this.getPlayer().setMoney(wallet);
                    Shield previosShield = this.getPlayer().getInventory().getShield();
                    System.out.println("Previos shield: " + previosShield.getShieldName());
                    this.getPlayer().getInventory().setShield(selectedShield);
                    Shield newShield = this.getPlayer().getInventory().getShield();
                    int totalDefence = previosShield.getShieldDefence() + newShield.getShieldDefence();
                    System.out.println("New shield: " + newShield.getShieldName() + "Total Defence: " + totalDefence + " Wallet: " + wallet);


                }
        }

        }
    }
}
