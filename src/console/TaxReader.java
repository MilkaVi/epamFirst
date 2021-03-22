package console;

import factory.CreateMainTax;
import model.profit.*;
import model.tax.Tax;

import java.util.TreeSet;

public class TaxReader {
    public TreeSet<Tax> read() {
        TreeSet<Tax> taxs = new TreeSet<>();
        taxs.add(new CreateMainTax().factoryMethod("Main", 0.1, new MainProfit()));
        taxs.add(new CreateMainTax().factoryMethod("Additional", 0.08, new AdditionalProfit()));
        taxs.add(new CreateMainTax().factoryMethod("Royalties", 0.07, new RoyaltiesProfit()));
        taxs.add(new CreateMainTax().factoryMethod("SaleOfProperty", 0.08, new SaleOfPropertyProfit()));
        taxs.add(new CreateMainTax().factoryMethod("Gifts", 0.02, new GiftsProfit()));
        taxs.add(new CreateMainTax().factoryMethod("AbroadTransfrs", 0.2, new AdditionalProfit()));
        taxs.add(new CreateMainTax().factoryMethod("Benefits", 0.03, new BenefitsProfit()));
        return taxs;
    }
}
