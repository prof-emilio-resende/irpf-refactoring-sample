package fit.application.impl;

import fit.application.abstractions.DiscountTable;

public class DiscountTable2021 implements DiscountTable {

    @Override
    public double getExemptionValue() {
        return 1903.98;
    }

    @Override
    public double getDependentsValue(int number) {
        return number * 189.59;
    }


    
}
