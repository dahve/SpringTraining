package plumber_old;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Hammer implements Tool {
    public void setSize(double size) {
        this.size = size;
    }

    public double size = 100;

    public Hammer(){

    }
    public Hammer(double size) {
        this.size = size;
    }
    public double getSize(){
        return size;
    }
}
