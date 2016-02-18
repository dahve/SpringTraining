package plumber_new;

/**
 * Created by Administrator on 18/02/2016.
 */
public class BuildHelper {

    private Plumber plumber;
    private Tool tool;

    public void setPlumber(Plumber plumber) {
        this.plumber = plumber;
    }

    public BuildHelper() {
    }
    public Plumber getPlumber(){
        return plumber;
    }
    public Tool getTool(){
        return plumber.getTool();
    }

}
