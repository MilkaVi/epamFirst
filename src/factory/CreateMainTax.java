package factory;

import model.profit.Profit;
import model.tax.MainTax;
import model.tax.Tax;

public class CreateMainTax extends Creator {


    @Override
    public MainTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new MainTax(taxName, taxPersent, profit);
    }
}
