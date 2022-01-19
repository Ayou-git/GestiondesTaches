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

import ma.igoudconsulting.taskmanagement.model.Role;
import ma.igoudconsulting.taskmanagement.service.impl.RoleServiceImpl;

@RestController
@RequestMapping(path = "/api/role")
public class RoleController {
	
	private final RoleServiceImpl implRole;

	@Autowired
	public RoleController(RoleServiceImpl implRole) {
		super();
		this.implRole = implRole;
	}

	@GetMapping
	public List<Role> GetAll() {
		return this.implRole.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Role> GetByID(@PathVariable Long id) {
		return this.implRole.findOne(id);
	}

	@PostMapping
	public void Add(@RequestBody Role role) {
		 this.implRole.save(role);
	}

	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable Long id) {
		this.implRole.delete(id);
	}

	@PutMapping("/{id}")
	public void Update(@RequestBody Role role) {
		 this.implRole.update(role);
	}


}
