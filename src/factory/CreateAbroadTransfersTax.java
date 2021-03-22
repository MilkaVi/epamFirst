package factory;

import model.profit.Profit;
import model.tax.AbroadTransfersTax;
import model.tax.Tax;

public class CreateAbroadTransfersTax extends Creator{
    @Override
    public AbroadTransfersTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new AbroadTransfersTax(taxName, taxPersent, profit);
    }
}
