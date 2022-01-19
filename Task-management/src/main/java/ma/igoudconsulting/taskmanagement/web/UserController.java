package ma.igoudconsulting.taskmanagement.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.igoudconsulting.taskmanagement.model.State;
import ma.igoudconsulting.taskmanagement.model.User;
import ma.igoudconsulting.taskmanagement.service.impl.StateServiceImpl;
import ma.igoudconsulting.taskmanagement.service.impl.UserServiceImpl;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {
	
	private final UserServiceImpl implUser;

	@Autowired
	public UserController(UserServiceImpl implUser) {
		super();
		this.implUser = implUser;
	}

	@GetMapping
	public List<User> GetAll() {
		return this.implUser.findAll();
	}

	@GetMapping("/{id}")
	public Optional<User> GetByID(@PathVariable Long id) {
		return this.implUser.findOne(id);
	}

	@PostMapping
	public void Add(@RequestBody User user) {
		 this.implUser.save(user);
	}

	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable Long id) {
		this.implUser.delete(id);
	}

	@PutMapping("/{id}")
	public void Update(@RequestBody User user) {
		 this.implUser.update(user);
	}

}
