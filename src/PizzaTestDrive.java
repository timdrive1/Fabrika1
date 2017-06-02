/**
 * Created by Тим on 02.06.2017.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("с сыром");
        System.out.println("Заказал " + pizza.getName() + "\n");

        pizza = store.orderPizza("для *******");
        System.out.println("Заказал " + pizza.getName() + "\n");
    }
}