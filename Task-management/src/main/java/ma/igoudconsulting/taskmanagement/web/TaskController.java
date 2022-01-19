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
import ma.igoudconsulting.taskmanagement.model.Task;
import ma.igoudconsulting.taskmanagement.service.impl.StateServiceImpl;
import ma.igoudconsulting.taskmanagement.service.impl.TaskServiceImpl;

@RestController
@RequestMapping(path = "/api/task")
public class TaskController {
	
	private final TaskServiceImpl implTask;

	@Autowired
	public TaskController(TaskServiceImpl implTask) {
		super();
		this.implTask = implTask;
	}

	@GetMapping
	public List<Task> GetAll() {
		return this.implTask.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Task> GetByID(@PathVariable Long id) {
		return this.implTask.findOne(id);
	}

	@PostMapping
	public void Add(@RequestBody Task task) {
		 this.implTask.save(task);
	}

	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable Long id) {
		this.implTask.delete(id);
	}

	@PutMapping("/{id}")
	public void Update(@RequestBody Task task) {
		 this.implTask.update(task);
	}


}
