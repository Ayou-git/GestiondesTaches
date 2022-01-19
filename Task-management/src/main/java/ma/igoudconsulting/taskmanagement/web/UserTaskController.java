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

import ma.igoudconsulting.taskmanagement.model.Task;
import ma.igoudconsulting.taskmanagement.model.UserTask;
import ma.igoudconsulting.taskmanagement.service.impl.UserTaskServiceImpl;


@RestController
@RequestMapping(path = "/api/usertask")
public class UserTaskController {
	private final UserTaskServiceImpl implUserTask;

	@Autowired
	public UserTaskController(UserTaskServiceImpl implUserTask) {
		super();
		this.implUserTask = implUserTask;
	}

	@GetMapping
	public List<UserTask> GetAll() {
		return this.implUserTask.findAll();
	}

	@GetMapping("/{id}")
	public Optional<UserTask> GetByID(@PathVariable Long id) {
		return this.implUserTask.findOne(id);
	}

	@PostMapping
	public void Add(@RequestBody UserTask usertask) {
		 this.implUserTask.save(usertask);
	}

	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable Long id) {
		this.implUserTask.delete(id);
	}

	@PutMapping("/{id}")
	public void Update(@RequestBody UserTask usertask) {
		 this.implUserTask.update(usertask);
	}


}
