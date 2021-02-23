package fit.core;

import fit.application.abstractions.DiscountTable;
import fit.application.abstractions.RateTable;
import fit.application.factories.DiscountTableFactory;
import fit.application.factories.RateTableFactory;
import fit.domain.Person;

public class IrpfCalculator {
  
  private final RateTable rateTable;
  private final DiscountTable discountTable;
  private Person person;

  public IrpfCalculator(int year, Person person) {
    super();
    this.rateTable = RateTableFactory.build(year);
    this.discountTable = DiscountTableFactory.build(year);
    this.person = person;
  }

  public double calculateBaseSalary() {
    return this.person.getTotalSalary() - this.rateTable.getInss(this.person.getTotalSalary());
  }

  public double calculateExemption() {
    return this.discountTable.getExemptionValue();
  }

  public double calculateDiscount() {
    return this.calculateBaseSalary() - this.calculateExemption();
  }

  public double calculateTaxLayer() {
    return this.rateTable.getRate(this.person.getTotalSalary());
  }

  public double calculate() {
    var discountValue = this.calculateDiscount();
    var taxValue = this.calculateTaxLayer();

    return discountValue * taxValue;
  }
}
