package factory;

import model.profit.Profit;
import model.tax.SaleOfPropertyTax;
import model.tax.Tax;

public class CreateSaleOfPropertyTax extends Creator{
    @Override
    public SaleOfPropertyTax factoryMethod(String taxName, double taxPersent, Profit profit) {
        return new SaleOfPropertyTax(taxName, taxPersent, profit);
    }
}
