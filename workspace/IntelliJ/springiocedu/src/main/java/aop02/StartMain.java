package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class StartMain {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("aop02.xml");
		String beanName;
		if (new Random().nextBoolean())
			beanName = "customer";
		else
			beanName = "emp";
		Person p=(Person)factory.getBean(beanName); // customer or emp
		p.work();
		((ClassPathXmlApplicationContext)factory).close();
	}
}
