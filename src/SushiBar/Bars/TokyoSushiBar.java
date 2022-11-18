package SushiBar.Bars;

import SushiBar.Sushis.*;
import SushiBar.SushiType;
public class TokyoSushiBar extends SushiBar{
    @Override
    public Sushi makeSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case VULCAN:
                sushi = new TokyoVulcan();
                break;
            case EBI:
                sushi = new TokyoEbi();
                break;
            case FILADELFIA:
                sushi = new TokyoFiladelfia();
                break;
            case BONITO:
                sushi = new TokyoBonito();
                break;
        }
        return sushi;
    }
}
