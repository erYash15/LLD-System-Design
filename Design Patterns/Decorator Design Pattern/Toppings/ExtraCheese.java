package Toppings;
import Pizza.*;
public class ExtraCheese extends TopOfPizza{

    BasePizza pizza;// = new VegPizza();

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
