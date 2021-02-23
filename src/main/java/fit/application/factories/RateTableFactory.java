package fit.application.factories;

import fit.application.abstractions.RateTable;
import fit.application.impl.RateTable2021;

public abstract class RateTableFactory {
    public static RateTable build(int year) {
        if (year == 2021) return new RateTable2021();

        return null;
    }
}
