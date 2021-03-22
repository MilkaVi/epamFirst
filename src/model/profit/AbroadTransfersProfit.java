package model.profit;

public class AbroadTransfersProfit implements Profit{
    @Override
    public double getProfit() {
        return 1 * Math.random() * 4;
    }
}
