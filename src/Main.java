import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Red", 5, "A4", false);
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
        /*/




        int a;
        int b;
        a = 10;
        b = 2;
        int c;
        c = a - b;
        System.out.println();

        Kalkulator calc = new Kalkulator();
                calc.add(5,2)
        System.out.println(calc.add(1,2));

         */

        Kalkulator calc = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze podac liczbe");
        int x = scanner.nextInt();
        System.out.println("Podaj jaka operacje chcesz wykonac wpisujac + - *");
        String znak = scanner.next();
        System.out.println("Podaj druga liczbe");
        int y = scanner.nextInt();

        switch (znak) {
            case "+":
                System.out.println(calc.add(x, y));
                break;
            case "-":
                System.out.println(calc.sub(x, y));
                break;
            case "*":
                System.out.println(calc.multiply(x, y));
                break;
            case "/":
                System.out.println(calc.);
        }
    }
}
