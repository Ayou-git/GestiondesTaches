package ma.igoudconsulting.taskmanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.igoudconsulting.taskmanagement.model.Task;
import ma.igoudconsulting.taskmanagement.repository.TaskRepository;
import ma.igoudconsulting.taskmanagement.service.TaskService;


@Service
public class TaskServiceImpl implements TaskService{
    
	@Autowired
	TaskRepository repositiry;
	
	@Override
	public Optional<Task> findOne(Long id) {
		return repositiry.findById(id);
	}

	@Override
	public List<Task> findAll() {

		return (List<Task>) repositiry.findAll();
	}

	@Override
	public void save(Task task) {
		
     repositiry.save(task);		
	}

	@Override
	public void update(Task task) {
		
	     repositiry.save(task);		
		
	}

	@Override
	public void delete(Long id) {
       repositiry.deleteById(id);
	}

	@Override
	public void delete(Task task) {
    repositiry.delete(task);

	}

}
