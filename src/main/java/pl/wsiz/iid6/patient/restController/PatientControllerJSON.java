package pl.wsiz.iid6.patient.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsiz.iid6.patient.entity.PatientEntity;
import pl.wsiz.iid6.patient.service.PatientService;
import pl.wsiz.iid6.patient.dto.Pacjent;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
public class PatientControllerJSON {
    @Autowired
    private PatientService patientService;

    @GetMapping(value = "patientId/{idP}", produces = "application/json")
    public Pacjent indexId(@PathVariable Long idP) {
        Pacjent product = patientService.findbyId(idP);
        return product;
    }
    @GetMapping(value = "all", produces = "application/json")
    public List<PatientEntity> index() {
        List<PatientEntity> product = patientService.findAll();
        return product;
    }
    @GetMapping(value="pesel/{pesel}", produces = "application/json")
    public List<PatientEntity> pesel(@PathVariable String pesel) {
        List<PatientEntity> pacjents = patientService.findAllByPesel(pesel);
        return pacjents;
    }
    @PostMapping(value = "/patientSave", produces = "application/json")
    public Pacjent save(@RequestBody Pacjent pacjent) {
        patientService.saveNewPacjent(pacjent);
        return pacjent;
    }
}
