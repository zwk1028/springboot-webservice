package demo.spring.service;

import javax.jws.WebService;

import demo.spring.bean.User;

@WebService
public interface HelloWorld {
	 String sayHi(String text);
	 User getUser();
}
