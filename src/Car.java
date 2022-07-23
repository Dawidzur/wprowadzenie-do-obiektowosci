public class Car {
    private String colour;
    private int doorsAmount;
    private String brand;
    private boolean automaticGearbox;

    public Car(String colour, int doorsAmount, String brand, boolean automaticGearbox){
        this.colour = colour;
        this.doorsAmount = doorsAmount;
        this.brand = brand;
        this.automaticGearbox = automaticGearbox;
    }

    public void setAutomaticGearbox(boolean automaticGearbox) {
        this.automaticGearbox = automaticGearbox;
    }
    public boolean getAutomaticGearbox(){
        return automaticGearbox;
    }
}
