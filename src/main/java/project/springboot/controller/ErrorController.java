package project.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller("error")
public class ErrorController {

	@ExceptionHandler(Exception.class)// we can specify particular exception class also here.
	public String sendToError() {
		return "error";
	}
}
