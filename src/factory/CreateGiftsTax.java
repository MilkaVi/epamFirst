package factory;

import model.profit.Profit;
import model.tax.GiftsTax;
import model.tax.Tax;

public class CreateGiftsTax extends Creator{
    @Override
    public GiftsTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new GiftsTax(taxName, taxPersent, profit);
    }
}
