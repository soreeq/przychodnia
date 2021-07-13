package pl.wsiz.iid6.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;
import pl.wsiz.iid6.patient.PatientServiceApplication;
import pl.wsiz.iid6.patient.dto.Pacjent;
import pl.wsiz.iid6.patient.entity.PatientEntity;
import pl.wsiz.iid6.patient.service.PatientService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @GetMapping(path="/index0")
    @ResponseBody
    public String indexOld() {
        return "index.html";
    }

    @GetMapping(path="/index")
    public String index() {
        return "index.html";
    }

    @GetMapping(path="/age")
    @ResponseBody
    public String age(@RequestParam(required = true) int yearNow, @RequestParam int yearBirth) {
        return Integer.toString(yearNow-yearBirth);
    }
    @GetMapping(path="/id")
    @ResponseBody
    public String patientId(@RequestParam Long idP){

        return (patientService.findbyId(idP)).toString();
    }
    @RequestMapping(value = "/pacjent")
    public String pacjent(final ModelMap model, Long idP) {
        model.addAttribute("nr", idP);
        Pacjent patient = patientService.findbyId(idP);
        model.addAttribute("imie", patient.getImie());
        model.addAttribute("nazwisko", (patient.getNazwisko()));
        model.addAttribute("pesel", (patient.getPesel()));
        return "pacjent.html";
    }

    @GetMapping(path="/names")
    @ResponseBody
    public String patientName(@RequestParam String name){
        return (patientService.findByLastName(name)).toString();
    }

    @GetMapping(path="/namesWeb")
    public String patientNameWeb(final ModelMap model, @RequestParam String name){
        List<PatientEntity>patientByName = patientService.findByLastName(name);
        model.addAttribute("patientsByName", patientByName);
        return "pacjentByName.html";
    }

    // ----
    @GetMapping(path="/patientsall")
    public String listPatients(final ModelMap model) throws Exception {
        List<PatientEntity> allPatient = patientService.findAll();
        model.addAttribute("patients", allPatient);
        return  "pacjentAll.html";
    }
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("formularz", "pacjent",
                new Pacjent());
    }
    @RequestMapping(value = "/addPatient", method = RequestMethod.POST)
    public String submit(@Validated @ModelAttribute("pacjent")Pacjent pacjent,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("imie", pacjent.getImie());
        model.addAttribute("nazwisko", pacjent.getNazwisko());
        model.addAttribute("pesel", pacjent.getPesel());
        model.addAttribute("nrUbezpieczenia", pacjent.getNrUbezpieczenia());
        patientService.saveNewPacjent(pacjent);
        return "formularz";
    }
    @GetMapping(path="/all")
    @ResponseBody
    public String patientAll(){
        String s="";
        for (PatientEntity x : patientService.findAll()){
            s=s+"<p>"+x.getFirstName()+" "+x.getLastName()+" "+x.getPesel()+"</p>";
        }
        return s;
    }


}
