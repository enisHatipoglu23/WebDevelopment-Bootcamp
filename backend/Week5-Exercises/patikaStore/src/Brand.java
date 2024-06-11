public class Brand {
    private static int idCounter = 1;
    private int id;
    private String name;

    public Brand(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
