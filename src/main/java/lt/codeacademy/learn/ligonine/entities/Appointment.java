package lt.codeacademy.learn.ligonine.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "vizitas")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@ManyToMany
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.MERGE, CascadeType.PERSIST})
	@Column(name="doctor_id")
	List<Doctor> gydytojai = new ArrayList<>();

	public Appointment(Long id, List<Doctor> gydytojai) {
		this.id = id;
		this.gydytojai = gydytojai;
	}

	public Appointment(List<Doctor> gydytojai) {
		this.gydytojai = gydytojai;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Doctor> getGydytojai() {
		return gydytojai;
	}

	public void setGydytojai(List<Doctor> gydytojai) {
		this.gydytojai = gydytojai;
	}	
}
