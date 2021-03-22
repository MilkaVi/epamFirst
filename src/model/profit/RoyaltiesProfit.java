package model.profit;

public class RoyaltiesProfit implements Profit{
    @Override
    public double getProfit() {
        return 5 * Math.random() * 3;
    }
}
