package xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 18/02/2016.
 */
public class main {

    public static void main(String[] args){
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/builders.applicationContext.xml")){
            HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");
            System.out.println(helloWorld.getName());

        }
    }
}
