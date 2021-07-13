package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.patient.dto.Lek;
import pl.wsiz.iid6.patient.service.LekService;

@Controller
@RequestMapping(value = "/medicine")
public class MedicineController {
    //automatycznie wstrzyknięte - my nie tworzymy instancji obiektu :)
    @Autowired
    private LekService lekService;

    /*@GetMapping(path="/findMedicine")
    @ResponseBody
    public Lek getMedine(@RequestParam Long id){
        // wstrzykujemy LekService
        return lekService.findbyId(id);
    }*/
    @RequestMapping(value = "/leki")
    public String indexLeki() {
        return "lekiinfo.html";
    }

    @GetMapping(path="/findMedicine")
    @ResponseBody
    public Lek getMedine(@RequestParam String name){
        // wstrzykujemy LekService
        return lekService.findLek(name);
    }
    @GetMapping(path="/allMedicine")
    @ResponseBody
    public String getAllMedine(){
        // wstrzykujemy LekService
        return lekService.getAllLek();
    }
}
