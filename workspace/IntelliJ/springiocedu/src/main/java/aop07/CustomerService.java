package aop07;

import org.springframework.stereotype.Component;

@Component(value = "customer") // 원하는 이름으로 설정
public class CustomerService implements Person{
	@Override
	public void work() {
		System.out.println("고객 서비스 진행");
	}
}
