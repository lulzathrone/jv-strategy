package core.basesyntax;

import core.basesyntax.impl.BirthdayDiscountService;
import core.basesyntax.impl.BlackFridayDiscountService;
import core.basesyntax.impl.DefaultDiscountService;
import core.basesyntax.impl.NewYearDiscountService;
import core.basesyntax.strategy.DiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case ("Birthday"):
                return new BirthdayDiscountService();
            case ("New Year"):
                return new NewYearDiscountService();
            case ("Black Friday"):
                return new BlackFridayDiscountService();
            default:
                return new DefaultDiscountService();
        }
    }
}
