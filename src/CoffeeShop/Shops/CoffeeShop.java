package CoffeeShop.Shops;

import CoffeeShop.Coffees.Coffee;
import CoffeeShop.CoffeeType;

public abstract class CoffeeShop {
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    public abstract Coffee createCoffee(CoffeeType type);

}
