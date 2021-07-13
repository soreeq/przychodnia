package pl.wsiz.iid6.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.patient.dto.Lek;
import pl.wsiz.iid6.patient.entity.LekEntity;
import pl.wsiz.iid6.patient.jpa.LekRepository;
import pl.wsiz.iid6.patient.jpa.PatientRepository;

import java.util.Arrays;
import java.util.Optional;

@Service
public class LekService {
    @Autowired
    private LekRepository lekRepository;

    public Lek findbyId(Long id){
        Optional<LekEntity> res = lekRepository.findById(id);
        if (res.isPresent()) {
            LekEntity lek = res.get();
            return new Lek(lek.getNazwa(),lek.getProducent());
        }
        return new Lek("None", "None");
    }


    private Lek[] leki = {new Lek("Ibuprom", "Sanofi"),
            new Lek("szczepionka", "Astra"),
            new Lek("Paracetamol", "Polfa")};

    public Lek findLek(String nazwa){
        for(Lek lek: leki){
            if (lek.getNazwa().equals(nazwa)) {
                return lek;
            }
        }
        return new Lek(nazwa);//throw new ..Exception
    }

    public String getAllLek(){ {
            String allMedicine="Lek - Producent; ";
            for(Lek lek: leki){
                allMedicine = allMedicine+lek.getNazwa()+" - "+lek.getProducent()+"; ";
            }
            return allMedicine;
        }
    }

}
