package lt.codeacademy.learn.ligonine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lt.codeacademy.learn.ligonine.entities.Patient;
import lt.codeacademy.learn.ligonine.services.PatientService;


@Controller
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@GetMapping("/")
	public String homeEndPoint(){
		return "This is a home page";
	}
	
	@GetMapping("/signuppat")
	public String showSignUpFormP(Patient patient){
		return "create-patient";
	}
	
	@PostMapping("/createpatient")
	public String addPatient(Patient patient, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "create-patient";
        }
        
        patientService.save(patient);
        return "redirect:/indexp";
    }
	
	@GetMapping("/indexp")
	public String showPatientList(Model model) {
	    model.addAttribute("patients", patientService.findAll());
	    return "indexp";
	}
	@GetMapping("/editp/{id}")
	public String showUpdateFormP(@PathVariable("id") long id, Model model) {
	    Patient patient = patientService.findById(id);
	    model.addAttribute("patient", patient);
	    return "update-patient";
	}
	
	@PostMapping("/updatep/{id}")
	public String updatePatient(@PathVariable("id") long id, Patient patient, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        patient.setId(id);
	        return "update-patient";
	    }
	        
	    patientService.save(patient);
	    return "redirect:/indexp";
	}
	
	@GetMapping("/deletep/{id}")
	public String deletePatient(@PathVariable("id") long id, Model model) {
	    Patient patient = patientService.findById(id); 
	    patientService.delete(patient);
	    return "redirect:/indexp";
	}	
}
