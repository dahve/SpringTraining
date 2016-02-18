package buildaccounts;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 18/02/2016.
 */
public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("buildaccounts.applicationContext.xml")) {
            AccountService accountService = (AccountService) context.getBean("accountService");
            accountService.printSomething();
        }

    }
}