package lt.codeacademy.learn.ligonine.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lt.codeacademy.learn.ligonine.entities.Doctor;


@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
