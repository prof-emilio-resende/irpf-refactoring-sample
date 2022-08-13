package fit.domain;

public class Person {

    private double totalSalary;
    private int dependents;

    public Person(double totalSalary, int dependents) {
        this.totalSalary = totalSalary;
        this.dependents = dependents;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getDependents() {
        return dependents;
    }

    public void setDependents(int dependents) {
        this.dependents = dependents;
    }

    

}
