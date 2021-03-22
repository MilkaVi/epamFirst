package model.tax;

import model.profit.Profit;

public class AdditionalTax extends Tax{
    public AdditionalTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
