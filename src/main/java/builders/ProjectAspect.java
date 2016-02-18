package builders;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by Administrator on 18/02/2016.
 */

@Aspect
public class ProjectAspect {
    @Before("execution(* WorkProject.calculateCost(..))")
    public void printTime(){
        System.out.println(System.currentTimeMillis());
    }

}
