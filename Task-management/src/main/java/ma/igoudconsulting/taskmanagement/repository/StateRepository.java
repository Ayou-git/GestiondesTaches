package ma.igoudconsulting.taskmanagement.repository;


import org.springframework.data.repository.CrudRepository;

import ma.igoudconsulting.taskmanagement.model.State;

public interface StateRepository extends CrudRepository<State, Long> {

}
