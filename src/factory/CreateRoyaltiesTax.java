package factory;

import model.profit.Profit;
import model.tax.RoyaltiesTax;
import model.tax.Tax;

public class CreateRoyaltiesTax extends Creator{
    @Override
    public RoyaltiesTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new RoyaltiesTax(taxName, taxPersent, profit);
    }
}
