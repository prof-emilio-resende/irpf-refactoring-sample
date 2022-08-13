package fit.core;

import fit.domain.Person;

public class IrpfCalculator {
  /**
   *
   */
  private static final double EXEMPTION_VALUE_2021 = 1903.98;
  private static final double INSS_VALUE_2021 = 0.11;
  private static final double DEPENDENT_VALUE_2021 = 189.59;

  private int year;
  private Person person;

  public IrpfCalculator(int year, Person person) {
    super();
    this.year = year;
    this.person = person;
  }

  public double calculateInssValue() {
    return this.person.getTotalSalary() * INSS_VALUE_2021;
  }

  public double calculateDependentsValue() {
    return this.person.getDependents() * DEPENDENT_VALUE_2021;
  }

  public double calculateBaseSalary() {
    return this.person.getTotalSalary() - this.calculateDependentsValue() - this.calculateInssValue();
  }

  public static double calculateExemption() {
    return EXEMPTION_VALUE_2021;
  }

  public double calculateDiscount() {
    return this.calculateInssValue() + IrpfCalculator.calculateExemption();
  }

  public static double calculateTaxLayer(double baseSalary) {
    if (baseSalary <= 1903.98) return 0.0;
    if (baseSalary <= 2826.65) return 0.075;
    if (baseSalary <= 3751.05) return 0.15;
    if (baseSalary <= 4664.68) return 0.225;
    return 0.275;
  }

  public double calculate() {
    var salaryForIrpf = this.calculateBaseSalary() - IrpfCalculator.calculateExemption();
    var taxValue = IrpfCalculator.calculateTaxLayer(this.calculateBaseSalary());

    return salaryForIrpf * taxValue;
  }
}
