package model.tax;

import model.profit.Profit;

public class BenefitsTax extends Tax{
    public BenefitsTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
