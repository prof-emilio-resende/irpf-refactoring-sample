package fit.application.abstractions;

public interface DiscountTable {
    double getExemptionValue();
    double getDependentsValue(int number);
}
