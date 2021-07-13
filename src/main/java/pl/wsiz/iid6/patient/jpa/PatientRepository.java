package pl.wsiz.iid6.patient.jpa;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.entity.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Long>{
    List<PatientEntity> findAllByLastName(String lastName);
    List<PatientEntity> findAllByFirstName(String firstName);
    List<PatientEntity> findAllByPesel(String pesel);
    List<PatientEntity> findAll();
}

