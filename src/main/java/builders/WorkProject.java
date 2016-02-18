package builders;

import java.util.List;

/**
 * Created by Administrator on 18/02/2016.
 */
public class WorkProject {
    private double duration;
    private List<TradesPeople> tradesPeopleList;

    public WorkProject(List<TradesPeople> tradesPeopleList) {
        this.tradesPeopleList = tradesPeopleList;
    }

    public WorkProject(List<TradesPeople> tradesPeopleList, double duration) {
        this.tradesPeopleList = tradesPeopleList;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public List<TradesPeople> getTradesPeopleList() {
        return tradesPeopleList;
    }

    public void setTradesPeopleList(List<TradesPeople> tradesPeopleList) {
        this.tradesPeopleList = tradesPeopleList;
    }

    public double calculateCost(){
        double total = 0;
        for(int i=0; i<tradesPeopleList.size(); i++){
            total += tradesPeopleList.get(i).getRate();
        }
        return total*duration;
    }
}
