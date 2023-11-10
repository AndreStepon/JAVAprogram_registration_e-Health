package lt.codeacademy.learn.ligonine.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="pacient_name")
	private String fullName;	
	
	@Column(name="pacient_healthRecord")
	private String description;
	
	public Patient(long id, String fullName, String description) {
		this.id = id;
		this.fullName = fullName;
		this.description = description;
	}
	

	public Patient(String fullName, String description) {
		this.fullName = fullName;
		this.description = description;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", fullName=" + fullName + ", description=" + description + "]";
	}
}
