package project.springboot.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import project.springboot.model.Todo;

public interface TodoRepository extends CrudRepository<Todo,Integer>{

	List<Todo> findByUser(String name);
}
