public class Notebook extends Product{
    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(int price, String name, double discount,
                    Brand brand, int ram, int storage,
                    double screenSize) {
        super(price, name, discount, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
