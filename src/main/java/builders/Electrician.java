package builders;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Electrician implements TradesPeople {
    private double rate = 1 ;

    public Electrician() {
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
