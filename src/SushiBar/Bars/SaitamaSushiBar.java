package SushiBar.Bars;

import SushiBar.Sushis.*;
import SushiBar.SushiType;

public class SaitamaSushiBar extends SushiBar{
    @Override
    public Sushi makeSushi (SushiType type) {
        Sushi sushi = null;
        switch (type) {
            case VULCAN:
                sushi = new SaitamaVulcan();
                break;
            case EBI:
                sushi = new SaitamaEbi();
                break;
            case FILADELFIA:
                sushi = new SaitamaFiladelfia();
                break;
            case BONITO:
                sushi = new SaitamaBonito();
                break;
        }
        return sushi;
    }
}
