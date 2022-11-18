package CoffeeShop.Shops;

import CoffeeShop.Coffees.*;
import CoffeeShop.CoffeeType;

public class JapaneseCoffeeShop extends CoffeeShop {
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new JapaneseStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new JapaneseStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new JapaneseStyleCappucino();
                break;
            case LATTE:
                coffee = new JapaneseStyleLatte();
                break;
        }
        return coffee;
    }
}
