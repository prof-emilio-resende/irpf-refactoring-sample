package fit.application.abstractions;

public interface RateTable {
    double getInss(double baseSalary);
    double getRate(double baseSalary);
}
