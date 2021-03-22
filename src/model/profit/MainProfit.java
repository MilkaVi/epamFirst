package model.profit;

public class MainProfit implements Profit {
    @Override
    public double getProfit() {
        return 10 * Math.random() * 5;
    }
}
