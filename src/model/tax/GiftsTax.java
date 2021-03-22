package model.tax;

import model.profit.Profit;

public class GiftsTax extends Tax{
    public GiftsTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
