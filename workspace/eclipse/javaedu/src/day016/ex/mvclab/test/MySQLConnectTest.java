package day016.ex.mvclab.test;

import static org.junit.Assume.assumeTrue;

import java.sql.Connection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import day016.mvc.MySQLConnect;

@DisplayName("첫 번째 JUnit 테스트 클래스")
class MySQLConnectTest {

	@DisplayName("DB서버 접속 확인")
	@Test
	void test() {
		assumeTrue(MySQLConnect.connect() instanceof Connection);
	}

}
