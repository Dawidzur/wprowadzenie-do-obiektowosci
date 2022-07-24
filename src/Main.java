public class Main {
    public static void main(String[] args) {

        Car audi = new Car ("Red", 5, "A4", false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getAutomaticGearbox());

        System.out.println(audi.getColour());
        audi.setColour("Red");
        System.out.println(audi.getColour());

        System.out.println(audi.getBrand());
        audi.setBrand("A4");
        System.out.println(audi.getBrand());

        System.out.println(audi.getDoorsAmount());
        audi.setDoorsAmount(5);
        System.out.println(audi.getDoorsAmount());
    }
}
