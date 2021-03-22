package model.profit;

public class BenefitsProfit implements Profit{
    @Override
    public double getProfit() {
        return 3 * Math.random() * 7;
    }
}
