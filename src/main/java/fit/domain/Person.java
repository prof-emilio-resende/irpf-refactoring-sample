package fit.domain;

public class Person {
    private final double totalSalary;
    private final int dependentsNumber;

    // from now on only constructor and getters

    public Person(double totalSalary, int dependentsNumber) {
        this.totalSalary = totalSalary;
        this.dependentsNumber = dependentsNumber;
    }
    
    public double getTotalSalary() {
        return totalSalary;
    }

    public int getDependentsNumber() {
        return dependentsNumber;
    }
}
