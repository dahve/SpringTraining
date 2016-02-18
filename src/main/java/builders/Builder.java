package builders;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Builder implements TradesPeople{
    private double rate = 1;

    public Builder() {
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
