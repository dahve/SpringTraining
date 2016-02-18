package core;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Circle implements Shape {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.41*radius*radius;
    }
}
