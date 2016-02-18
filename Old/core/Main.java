package core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/builders.applicationContext.xml")) {
            Shape shape1 = (Shape) context.getBean("shape1");
            Circle circle = (Circle) context.getBean("shape1");


            printInfo(shape1);
            printInfo(circle);
        }
}

    private static void printInfo(Shape shape){
        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getArea());
    }

}

