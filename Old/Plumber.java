package plumber_new;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Plumber implements Handyman {
    private String name = "Luigi";
    private Tool tool;

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plumber() {
    }

    public Plumber(String name, Tool tool) {
        this.name = name;
        this.tool = tool;
    }
}
