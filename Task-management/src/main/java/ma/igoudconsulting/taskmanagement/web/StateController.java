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
import ma.igoudconsulting.taskmanagement.service.impl.StateServiceImpl;

@RestController
@RequestMapping(path = "/api/state")
public class StateController {

	private final StateServiceImpl implState;

	@Autowired
	public StateController(StateServiceImpl implState) {
		super();
		this.implState = implState;
	}

	@GetMapping
	public List<State> GetAll() {
		return this.implState.findAll();
	}

	@GetMapping("/{id}")
	public Optional<State> GetByID(@PathVariable Long id) {
		return this.implState.findOne(id);
	}

	@PostMapping
	public void Add(@RequestBody State state) {
		 this.implState.save(state);
	}

	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable Long id) {
		this.implState.delete(id);
	}

	@PutMapping("/{id}")
	public void Update(@RequestBody State state) {
		 this.implState.update(state);
	}

}
