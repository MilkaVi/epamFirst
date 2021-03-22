package model.tax;

import model.profit.Profit;

public class RoyaltiesTax extends Tax{
    public RoyaltiesTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
