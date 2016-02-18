package plumber_new;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/builders.applicationContext.xml")) {
            BuildHelper builder = (BuildHelper) context.getBean("handyman");
            System.out.println(builder.getPlumber() + " has extra tool: " + builder.getTool());
        }
    }

    //private static void printInfo( shape){
    //    System.out.println(shape.getClass().getSimpleName());
    //    System.out.println(shape.getArea());
    //}

}

