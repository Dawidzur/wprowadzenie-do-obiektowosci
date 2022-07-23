public class Main {
    public static void main(String[] args) {

        Car audi = new Car ("Red", 5, "A4", false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getAutomaticGearbox());
    }
}
