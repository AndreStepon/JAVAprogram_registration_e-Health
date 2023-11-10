package lt.codeacademy.learn.ligonine.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lt.codeacademy.learn.ligonine.entities.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {}
