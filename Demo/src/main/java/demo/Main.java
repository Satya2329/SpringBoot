package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static void main() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("data.xml");
        Emp e1 = ac.getBean("e1", Emp.class);
        System.out.println(e1);
    }
}
