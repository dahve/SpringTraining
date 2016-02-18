package plumber_old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Plumber implements Handyman {
    @Autowired
    @Qualifier(value="hammer")
    private Tool tool;
    private String name = "Luigi";


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

    public Plumber(String name) {
        this.name = name;
    }
}
