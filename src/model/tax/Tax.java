package model.tax;

import model.profit.Profit;

public abstract class Tax implements Comparable<Tax> {
    private String taxName;
    private double taxPersent;
    private Profit profit;

    public Tax(String taxName, double taxPersent, Profit profit) {
        this.taxName = taxName;
        this.taxPersent = taxPersent;
        this.profit = profit;
    }

    public String getTaxName() {
        return taxName;
    }

    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    public double getTaxPersent() {
        return taxPersent;
    }

    public void setTaxPersent(double taxPersent) {
        this.taxPersent = taxPersent;
    }

    public Profit getProfit() {
        return profit;
    }

    public void setProfit(Profit profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return
                "taxName='" + taxName + '\'' +
                ", taxPersent=" + taxPersent ;
    }

    public double getTax() {
        double taxForYear = 0;
        for (int i = 0; i < 12; i++) {
            taxForYear += profit.getProfit() * taxPersent;
        }
        return taxForYear;
    }

    @Override
    public int compareTo(Tax o) {
        return Double.compare(getTax(), o.getTax());
    }
}
