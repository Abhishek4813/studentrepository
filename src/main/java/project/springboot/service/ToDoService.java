package project.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.springboot.Repository.TodoRepository;
import  project.springboot.model.Todo;

@Service
public class ToDoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    @Autowired
    private TodoRepository repository;

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<Todo>();
       repository.findByUser(user).forEach(filteredTodos::add);
        return filteredTodos;
    }

    public void addTodo(Todo todo) {
    	repository.save(todo);
    }

    public void deleteTodo(int id) {
        repository.deleteById(id);
    }
    
    public Todo getTodoById(int id) {
    	return repository.findById(id).get();
    }
}
