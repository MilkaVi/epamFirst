package model.tax;

import model.profit.Profit;

public class AbroadTransfersTax extends Tax{
    public AbroadTransfersTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
