package model.tax;

import model.profit.Profit;

public class SaleOfPropertyTax extends Tax{
    public SaleOfPropertyTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
