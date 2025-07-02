package com.example.Patient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/getAllPatients")
    public String getAllPatients(){
        return "All Patients";
    }
    @GetMapping("/getPatientById")
    public String getPatientById(){
        return "Patient by id";
    }
}
