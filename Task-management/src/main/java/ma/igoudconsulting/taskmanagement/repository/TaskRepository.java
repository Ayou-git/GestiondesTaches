package ma.igoudconsulting.taskmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import ma.igoudconsulting.taskmanagement.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
