package fit.application.impl;

import fit.application.abstractions.RateTable;

public class RateTable2021 implements RateTable {

    private final double inssRate = 0.11;

    @Override
    public double getInss(double baseSalary) {
        return baseSalary * inssRate;
    }

    @Override
    public double getRate(double baseSalary) {
        if (baseSalary <= 1903.98) return 0.0;
        if (baseSalary <= 2826.65) return 0.075;
        if (baseSalary <= 3751.05) return 0.15;
        if (baseSalary <= 4664.68) return 0.225;
        return 0.275;
    }
    
}
