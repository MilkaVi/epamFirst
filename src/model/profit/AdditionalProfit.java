package model.profit;

public class AdditionalProfit implements Profit{
    @Override
    public double getProfit() {
        return 7 * Math.random() * 5;
    }
}
