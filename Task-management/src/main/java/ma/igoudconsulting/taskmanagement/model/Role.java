package ma.igoudconsulting.taskmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String description;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Role(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}


	public Role(Long id, String code, String description) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
