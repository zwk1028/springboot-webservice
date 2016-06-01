package demo.spring.service;

import javax.jws.WebService;

import demo.spring.bean.User;

@WebService(endpointInterface = "demo.spring.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}

	public User getUser() {
		User user = new User();
		user.setId(11);
		user.setName("luoshengsha");
		user.setPassword("123456");
		return user;
	}

}
