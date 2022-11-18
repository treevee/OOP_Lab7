import School.*;
import CoffeeShop.Shops.*;
import CoffeeShop.CoffeeType;

import SushiBar.Bars.*;
import SushiBar.SushiType;


public class Main {
    public static void main(String[] args) {
        //School Task
        School school = new School(1000, Seasons.SUMMER);
        System.out.println("There are "+ school.getStudentsAmount() + " students in school and is " + school.getSeason() + " now");


        //Coffee shop Task
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.createCoffee(CoffeeType.LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.createCoffee(CoffeeType.CAPPUCCINO);

        CoffeeShop japaneseCoffeeShop = new JapaneseCoffeeShop();
        americanCoffeeShop.createCoffee(CoffeeType.ESPRESSO);

        //Shushi bar Task
        TokyoSushiBar tokyoSushiBar= new TokyoSushiBar();
        tokyoSushiBar.makeSushi(SushiType.VULCAN);

        OsakaSushiBar osakaSushiBar = new OsakaSushiBar();
        osakaSushiBar.makeSushi(SushiType.EBI);

        SaitamaSushiBar saitamaSushiBar = new SaitamaSushiBar();
        saitamaSushiBar.makeSushi(SushiType.BONITO);

    }
}