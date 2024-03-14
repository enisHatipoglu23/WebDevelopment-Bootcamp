public class Ocean extends Location{

    public Ocean(Player player) {
        super(player,"Ocean", new Shark(),3);
    }

    @Override
    boolean onLocation() {
//        this.getGame().slowMotion("you are in the middle of the ocean." +
//                " the waves are big and sharks are around you. ",50);
        System.out.println("you are in the middle of the ocean." +
                " the waves are big and sharks are around you. ");
        System.out.println("there are " + this.randomEnemy() + " number of sharks around you.");
        return true;
    }
}
