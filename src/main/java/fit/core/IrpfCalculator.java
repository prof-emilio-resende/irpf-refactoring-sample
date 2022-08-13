package fit.core;

import fit.application.impl.DiscountTable;
import fit.application.impl.RateTable;
import fit.domain.Person;

public class IrpfCalculator {
  private int year;
  private Person person;
  private RateTable rateTable;
  private DiscountTable discountTable;

  public IrpfCalculator(int year, Person person) {
    super();
    this.year = year;
    this.person = person;
    this.rateTable = new RateTable();
    this.discountTable = new DiscountTable();
  }

  public double calculateInssValue() {
    return this.rateTable.calculateInssValue(this.person.getTotalSalary());
  }

  public double calculateDependentsValue() {
    return this.discountTable.calculateDependentsValue(this.person.getDependents());
  }

  public double calculateBaseSalary() {
    return this.person.getTotalSalary() - this.calculateDependentsValue() - this.calculateInssValue();
  }

  public double calculateExemption() {
    return this.discountTable.calculateExemption();
  }

  public double calculateDiscount() {
    return this.calculateInssValue() + this.calculateExemption();
  }

  public double calculateTaxLayer(double baseSalary) {
    return this.rateTable.calculateTaxLayer(baseSalary);
  }

  public double calculate() {
    var salaryForIrpf = this.calculateBaseSalary() - this.calculateExemption();
    var taxValue = this.calculateTaxLayer(this.calculateBaseSalary());

    return salaryForIrpf * taxValue;
  }
}
