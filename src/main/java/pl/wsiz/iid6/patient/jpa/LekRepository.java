package pl.wsiz.iid6.patient.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.entity.LekEntity;
import pl.wsiz.iid6.patient.entity.PatientEntity;

import java.util.List;

public interface LekRepository  extends CrudRepository<LekEntity, Long> {
    List<LekEntity> findAllByNazwa(String nazwa);
    List<LekEntity> findAllByProducent(String producent);
    List<LekEntity> findAllByIlosc(Integer ilosc);
    List<LekEntity> findAll();
}
