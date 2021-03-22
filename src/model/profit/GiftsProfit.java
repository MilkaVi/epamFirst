package model.profit;

public class GiftsProfit implements Profit{
    @Override
    public double getProfit() {
        return 2 * Math.random() * 5;
    }
}
