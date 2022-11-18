package CoffeeShop.Shops;

import CoffeeShop.Coffees.*;
import CoffeeShop.CoffeeType;

public class ItalianCoffeeShop extends CoffeeShop{
    @Override
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappucino();
                break;
            case LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
