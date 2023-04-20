package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalTime;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("exam1.xml");
        LocalTime time = (LocalTime)factory.getBean("localTime");
        Greeting greeting = null;

        int now = time.getHour();
        if (now >= 6 && now < 12) {
        greeting = (Greeting) factory.getBean("morningBean");
        } else if(now >= 12 && now < 17) {
        greeting = (Greeting) factory.getBean("afternoonBean");
        } else if(now >= 17 && now < 22) {
        greeting = (Greeting) factory.getBean("eveningBean");
        } else {
        greeting = (Greeting) factory.getBean("nightBean");
        }
        greeting.greet();

        ((ClassPathXmlApplicationContext)factory).close();
    }


}
