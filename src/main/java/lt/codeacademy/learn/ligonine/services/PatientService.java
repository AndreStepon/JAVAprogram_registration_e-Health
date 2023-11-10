package lt.codeacademy.learn.ligonine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.codeacademy.learn.ligonine.entities.Patient;
import lt.codeacademy.learn.ligonine.repositories.PatientRepository;


@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	public void save(Patient patient) {
		patientRepository.save(patient);
		
	}

	public Iterable<Patient> findAll(){
		return patientRepository.findAll();
	}
	
	public Patient findById(long id) {
		return patientRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid patient Id:" + id));
	}

	public void delete(Patient patient) {
		patientRepository.delete(patient);
	}
	
}
