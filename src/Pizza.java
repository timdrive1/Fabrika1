/**
 * Created by Тим on 02.06.2017.
 */
import java.util.ArrayList;

abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Готовлю " + name);
    }

    public void bake() {
        System.out.println("Пеку " + name);
    }

    public void cut() {
        System.out.println("Порэжу " + name);
    }

    public void box() {
        System.out.println("В коробку " + name);
    }


}