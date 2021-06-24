package project.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import project.springboot.service.Validation;

@Controller
@SessionAttributes("username")
public class Login {
	
	@Autowired
	private Validation valid;    //autowired the Validate object here.

	@RequestMapping(value="/login", method=RequestMethod.GET )
	public String login() {
		return "login";
		}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String sendTOdashboard(@RequestParam String username, @RequestParam String password, ModelMap model) {
		if(valid.verify(password)) {
			model.put("username", username);
			return "redirect:/list-todos";
		}
		
		model.put("msg","Invalid Credentials");
		return "login";
	}
}

