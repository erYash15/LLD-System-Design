
import Pizza.*;
import Toppings.*;

public class Shop {
    public static void main(String args[]){
        BasePizza pizza = new Onion(new ExtraCheese( new Onion(new NonVegPizza())));
        System.out.println(pizza.cost());

    }
}
