package webservice;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.service.HelloWorld;

public class WebServiceTest {
	private static HelloWorld helloworld;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			ApplicationContext cxt = new ClassPathXmlApplicationContext(
					new String[] { "beans.xml", "cxfClient-beans.xml" });
			helloworld = (HelloWorld) cxt.getBean("helloworldlClient");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void say() {
		helloworld.sayHi("ยÞษ๚ษณ");
	}
}
