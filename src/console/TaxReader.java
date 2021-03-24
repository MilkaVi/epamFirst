package console;

import model.profit.*;
import model.tax.Tax;

import java.util.TreeSet;

public class TaxReader {
    public TreeSet<Tax> read() {
        TreeSet<Tax> taxs = new TreeSet<>();
        taxs.add(new Tax("Main", 0.1, new ProfitCacher(new MainProfit())));
        taxs.add(new Tax("Additional", 0.08, new ProfitCacher(new AdditionalProfit())));
        taxs.add(new Tax("Royalties", 0.07, new ProfitCacher(new RoyaltiesProfit())));
        taxs.add(new Tax("SaleOfProperty", 0.08, new ProfitCacher(new SaleOfPropertyProfit())));
        taxs.add(new Tax("Gifts", 0.02, new ProfitCacher(new GiftsProfit())));
        taxs.add(new Tax("AbroadTransfrs", 0.2, new ProfitCacher(new AdditionalProfit())));
        taxs.add(new Tax("Benefits", 0.03, new ProfitCacher(new BenefitsProfit())));
        return taxs;
    }
}
