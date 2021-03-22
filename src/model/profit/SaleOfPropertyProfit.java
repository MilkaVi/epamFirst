package model.profit;

public class SaleOfPropertyProfit implements Profit{
    @Override
    public double getProfit() {
        return 7 * Math.random() * 2;
    }
}
