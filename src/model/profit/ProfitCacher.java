package model.profit;

public class ProfitCacher implements Profit {
    private Profit profit;
    private Double cachedProfit = null;
    public ProfitCacher(Profit profit) {
        this.profit = profit;
    }
    @Override
    public double getProfit() {
        if(cachedProfit == null) {
            cachedProfit = profit.getProfit();
        }
        return cachedProfit;
    }
}