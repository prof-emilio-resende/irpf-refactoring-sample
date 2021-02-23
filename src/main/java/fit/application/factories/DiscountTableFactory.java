package fit.application.factories;

import fit.application.abstractions.DiscountTable;
import fit.application.impl.DiscountTable2021;

public abstract class DiscountTableFactory {
    public static DiscountTable build(int year) {
        if (year == 2021) return new DiscountTable2021();

        return null;
    }
}
