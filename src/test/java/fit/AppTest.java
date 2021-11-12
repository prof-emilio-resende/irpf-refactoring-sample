package fit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fit.core.IrpfCalculator;
import fit.domain.Person;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldCalculateInssWith11Percent()
    {
        // arrange
        var year = 2021;
        var totalSalary = 3000.00;
        var baseSalaryExpected = 2670.00;
        // act
        var actualBaseSalary = new IrpfCalculator(year, new Person(totalSalary, 0)).calculateBaseSalary();
        // assert
        assertEquals(baseSalaryExpected, actualBaseSalary, 0.01);
    }

    @Test
    public void shouldCalculateTotalDiscountValue() {
        // arrange
        var year = 2021;
        var totalSalary = 3000.00;
        var dependents  = 0;
        var totalDiscountExpected = 766.02;

        // act
        var actualDiscountValue = new IrpfCalculator(year, new Person(totalSalary, dependents)).calculateDiscount();

        // assert
        assertEquals(totalDiscountExpected, actualDiscountValue, 0.01);
    }

    @Test
    public void shouldCalculateIrpfValue() {
        // arrange
        var year = 2021;
        var totalSalary = 3000.00;
        var dependents = 0;
        var irpfValueExpected = 57.45;

        // act
        var actualIrpfValue = new IrpfCalculator(year, new Person(totalSalary, dependents)).calculate();

        // assert
        assertEquals(irpfValueExpected, actualIrpfValue, 0.01);
    }

    @Test
    public void shouldCalculateIrpfValueWithDependents() {
        // arrange
        var year = 2021;
        var totalSalary = 3500.00;
        var dependents = 2;
        var irpfValueExpected = 62.39;

        // act
        var actualIrpfValue = new IrpfCalculator(year, new Person(totalSalary, dependents)).calculate();

        // assert
        assertEquals(irpfValueExpected, actualIrpfValue, 0.01);
    }
}
