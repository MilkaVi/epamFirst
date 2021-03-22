package factory;

import model.profit.Profit;
import model.tax.AdditionalTax;
import model.tax.Tax;

public class CreateAdditionalTax  extends Creator {
    @Override
    public AdditionalTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new AdditionalTax(taxName, taxPersent, profit);
    }
}
