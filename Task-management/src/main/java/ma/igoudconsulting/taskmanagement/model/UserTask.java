package ma.igoudconsulting.taskmanagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data  //pour lombok
@Entity(name = "user_task") //pour changer le nom de table a la base de donnee
public class UserTask {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	@Column(name="assignementdate_date") //pour change le nom de la ligne a la base de donnee
	private Date assignementdate;
	@ManyToOne
	private Task task;
	@ManyToOne
	private Role role;
	public UserTask() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserTask(Date assignementdate, Task task, Role role) {
		super();
		this.assignementdate = assignementdate;
		this.task = task;
		this.role = role;
	}
	public UserTask(Long id, Date assignementdate, Task task, Role role) {
		super();
		this.id = id;
		this.assignementdate = assignementdate;
		this.task = task;
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getAssignementdate() {
		return assignementdate;
	}
	public void setAssignementdate(Date assignementdate) {
		this.assignementdate = assignementdate;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
