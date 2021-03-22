package model.tax;

import model.profit.Profit;

public class MainTax extends Tax{
    public MainTax(String taxName, double taxPersent, Profit profit) {
        super(taxName, taxPersent, profit);
    }
}
