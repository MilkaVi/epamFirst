package factory;

import model.profit.Profit;
import model.tax.Tax;

public abstract class Creator {
    public abstract Tax factoryMethod(String taxName, double taxPersent, Profit profit);
}
