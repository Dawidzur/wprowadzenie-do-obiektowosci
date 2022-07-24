public class Car {
    private String colour;
    private int doorsAmount;
    private String brand;
    private boolean automaticGearbox;

    public Car(String colour, int doorsAmount, String brand, boolean automaticGearbox) {
        this.colour = colour;
        this.doorsAmount = doorsAmount;
        this.brand = brand;
        this.automaticGearbox = automaticGearbox;
    }

    public Car(String colour, int doorsAmount) {
        this.colour = colour;
        this.doorsAmount = doorsAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getAutomaticGearbox() {
        return automaticGearbox;
    }

    public void setAutomaticGearbox(boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }
}
