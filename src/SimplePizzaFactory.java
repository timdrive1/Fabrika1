/**
 * Created by Тим on 02.06.2017.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("с сыром")) {
            pizza = new CheesePizza();
        } else if (type.equals("пепперони")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("с ракушками")) {
            pizza = new ClamPizza();
        } else if (type.equals("для *******")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}