package ma.enset.hopitalapp.web;


import lombok.AllArgsConstructor;
import ma.enset.hopitalapp.entities.Patient;
import ma.enset.hopitalapp.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private final PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model){
        List<Patient> patientList=patientRepository.findAll();
        model.addAttribute("patientList",patientList);
        return "patients";
    }
}
