package ma.igoudconsulting.taskmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ma.igoudconsulting.taskmanagement.model.UserTask;

public interface UserTaskRepository extends CrudRepository<UserTask, Long>{

}
