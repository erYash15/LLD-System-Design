package Toppings;
import Pizza.*;

public class Onion implements BasePizza{

    BasePizza pizza;
    public Onion(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 20;
    }
}
