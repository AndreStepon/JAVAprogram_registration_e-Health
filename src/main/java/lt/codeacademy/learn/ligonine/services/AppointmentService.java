package lt.codeacademy.learn.ligonine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lt.codeacademy.learn.ligonine.repositories.AppointmentRepository;
import lt.codeacademy.learn.ligonine.repositories.DoctorRepository;
import lt.codeacademy.learn.ligonine.repositories.PatientRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	DoctorRepository doctorRepository;
	
	
}
