package project.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {

	@RequestMapping("/welcome")
	public String welcomePage() {
		return "welcome";
	}
}
