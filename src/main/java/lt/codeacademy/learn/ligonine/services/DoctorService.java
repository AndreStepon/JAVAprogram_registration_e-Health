package lt.codeacademy.learn.ligonine.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.codeacademy.learn.ligonine.entities.Doctor;
import lt.codeacademy.learn.ligonine.repositories.DoctorRepository;


@Service
public class DoctorService {

	
	@Autowired
	DoctorRepository doctorRepository;
	
	public void save(Doctor doctor) {
		doctorRepository.save(doctor);
		
	}
	
	public Iterable<Doctor> findAll(){
		return doctorRepository.findAll();
	}

	public Doctor findById(long id) {
		return doctorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid doctor Id:" + id));
	}
	
	public void delete(Doctor doctor) {
		doctorRepository.delete(doctor);
	}
}
