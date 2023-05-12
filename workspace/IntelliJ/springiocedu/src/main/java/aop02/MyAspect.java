package aop02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invo) {
		//대상 메서드 실행 전
		System.out.println("로그인 처리--");
		try {
			//대상 메서드 실행(target 객체에)
			invo.proceed();
		}catch(Throwable e) {
			System.out.println("예외발생!!!");
		}
		//대상 메서스 실행 후
		System.out.println("로그아웃 처리--");
		return null;
	}
}
