package abstractfactory;

/**
 *
 * @author lilith
 */
public class CoffeeFactory implements AbstractCoffeeFactory {

    @Override
    public Coffee newCappuccino() {
        System.out.println("Making cappuccino");
        return new Cappuccino();
    }

    @Override
    public Coffee newEsspresso() {
        System.out.println("Making espresso");
        return new Espresso();
    }

}
