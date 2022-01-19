package ma.igoudconsulting.taskmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	private Date dateCreation;
	@ManyToOne
	private State state;
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Task(String name, String description, Date dateCreation, State state) {
		super();
		this.name = name;
		this.description = description;
		this.dateCreation = dateCreation;
		this.state = state;
	}
	



	


	public Task(Long id, String name, String description, Date dateCreation, State state) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dateCreation = dateCreation;
		this.state = state;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	
	

}
