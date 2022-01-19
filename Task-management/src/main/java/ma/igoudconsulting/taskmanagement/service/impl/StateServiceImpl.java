package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.State;
import ma.igoudconsulting.taskmanagement.repository.StateRepository;
import ma.igoudconsulting.taskmanagement.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	private StateRepository repository;
	
	
	
	@Autowired
	public StateServiceImpl(StateRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Optional<State> findOne(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<State> findAll() {

		return (List<State>)  repository.findAll();
	}

	@Override
	public void save(State state) {
     repository.save(state);		
	}

	@Override
	public void update(State state) {
     repository.save(state);		
	}

	@Override
	public void delete(Long id) {
repository.deleteById(id);
	}

	@Override
	public void delete(State state) {
   repository.delete(state);
	}

}
