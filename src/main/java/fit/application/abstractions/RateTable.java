package fit.application.abstractions;

public interface RateTable {
    double getDependents(int numberOfDependents);
    double getInss(double baseSalary);
    double getRate(double baseSalary);
}
