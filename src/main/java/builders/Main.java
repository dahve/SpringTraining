package builders;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Main {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/builders.applicationContext.xml")) {

            System.out.println("hello");
            WorkProject proj = (WorkProject) context.getBean("project");
            System.out.println("cost" + proj.calculateCost());


        }
    }


}

