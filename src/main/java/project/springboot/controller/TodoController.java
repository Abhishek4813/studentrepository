package project.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import project.springboot.model.Todo;
import project.springboot.service.ToDoService;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

@Controller
@SessionAttributes("username")
public class TodoController {

	@Autowired   //autowired the service injections
	ToDoService service;
	
	@InitBinder
	public void initbind(WebDataBinder binder) {
		SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));	
	}
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String name=(String) model.get("username");
		model.put("name", name);
		model.put("todos", service.retrieveTodos(name));
		return "list-todo";
	}
	
	@RequestMapping(value="/add-todos", method=RequestMethod.GET)
	public String getAddTOdoForm(ModelMap model) {
		model.addAttribute("todo",new Todo(0,(String) model.get("username"),"",new Date(),false));
		return "add-todo";
	}
	
	@RequestMapping(value="/add-todos", method=RequestMethod.POST)
	public String AddTOdo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "add-todo";
		}
		String name=(String) model.getAttribute("username");
		todo.setUser(name);
		todo.setDone(false);
		service.addTodo(todo);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteToDo(@RequestParam String id) {
		service.deleteTodo(Integer.parseInt(id));
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateToDoForm(@RequestParam String id ,ModelMap model) {
		Todo todo=service.getTodoById(Integer.parseInt(id));
		model.put("todo",todo);
		return "add-todo";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateToDo(Todo todo,ModelMap model) {
		todo.setUser((String) model.getAttribute("username"));
		todo.setDone(false);
		service.addTodo(todo);
		return "redirect:/list-todos";
	}
}
