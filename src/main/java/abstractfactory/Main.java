package abstractfactory;

/**
 *
 * @author lilith
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting abstract factory");
        System.out.println("============");

        AbstractCoffeeFactory factory = new CoffeeFactory();
        Coffee capCoffee = factory.newCappuccino();
        Coffee esspessCoffee = factory.newEsspresso();

    }
}
