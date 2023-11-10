package lt.codeacademy.learn.ligonine.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lt.codeacademy.learn.ligonine.entities.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long>{

}
