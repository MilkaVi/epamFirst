package factory;

import model.profit.Profit;
import model.tax.BenefitsTax;
import model.tax.Tax;

public class CreateBenefitsTax extends Creator {
    @Override
    public BenefitsTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new BenefitsTax(taxName, taxPersent, profit);
    }
}
