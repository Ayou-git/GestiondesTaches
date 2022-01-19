package ma.igoudconsulting.taskmanagement.repository;

import org.springframework.data.repository.CrudRepository;

import ma.igoudconsulting.taskmanagement.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
