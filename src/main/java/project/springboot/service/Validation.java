package project.springboot.service;

import org.springframework.stereotype.Component;

@Component  //we need bean of it in login controller so we use @Component
public class Validation {

	public boolean verify(String password) {
		return password.length()>=6;
	}
}
