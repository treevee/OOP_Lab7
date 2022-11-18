package SushiBar.Bars;

import SushiBar.Sushis.Sushi;
import SushiBar.SushiType;

public abstract class SushiBar {
    public Sushi orderCoffee(SushiType type) {
        Sushi sushi = makeSushi(type);

        sushi.rollSushi();
        sushi.cutIntoPieces();

        System.out.println("Вот ваши роллы! Спасибо, приходите еще!");
        return sushi;
    }

    public abstract Sushi makeSushi(SushiType type);
}
