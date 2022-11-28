package Inheritance.Inheritance3;

import Inheritance.Inheritance2.WageEmployeee;

public class SalesPerson extends WageEmployeee{
    int sales;
    int commission;

    public SalesPerson(int hrs, int rate, int sales, int commission) {
        super(hrs, rate);
        this.sales = sales;
        this.commission = commission;
    }

    public SalesPerson(int hrs, int rate) {
        super(hrs, rate);
    }

    public void WageEmployeee(int sales, int commission)
    {
        SalesPerson salesPerson = new SalesPerson(10,40,1000,1000);
        salesPerson.WageEmployeee(10,40);
    }

}
