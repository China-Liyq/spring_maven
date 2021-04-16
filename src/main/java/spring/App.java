package spring;

import com.chinaliyq.spring.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liyq
 * @Description: spring_maven
 * @Date: 2021/4/15 - 22:56
 * @Version: 1.0
 **/
public class App {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        final Person xy = ctx.getBean("xy", Person.class);
        System.out.println(xy);
    }
}
