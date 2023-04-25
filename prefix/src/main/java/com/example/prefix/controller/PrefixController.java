package com.example.prefix.controller;


import com.example.prefix.entity.*;
import com.example.prefix.repositroy.AppointmentRepo;
import com.example.prefix.repositroy.GenderRepo;
import com.example.prefix.repositroy.PrefixGenderMappingRepo;
import com.example.prefix.repositroy.PrefixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
//@RequestMapping("/prefix")
public class PrefixController {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired

    private GenderRepo genderRepo;

  
    @Autowired

    private PrefixRepo prefixRepo;

    @Autowired

    private PrefixGenderMappingRepo prefixGenderMappingRepo;


    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender){
        genderRepo.save(gender);
        return "gender saved";

    }
@PostMapping("savePrefix")
    public String saveGenderPrefix(@RequestBody Prefix prefix){
    Prefix prefix1 = prefixRepo.save(prefix);

        PrefixGenderMappingId prefixGenderMappingId = new PrefixGenderMappingId();
        prefixGenderMappingId.setPrefixId(prefix1.getId());
        prefixGenderMappingId.setGenderId(prefix1.getGenderId());
        PrefixGenderMapping prefixGenderMapping= new PrefixGenderMapping();
    prefixGenderMapping.setPrefixGenderMappingId(prefixGenderMappingId);
    prefixGenderMappingRepo.save(prefixGenderMapping);
    return "prefix saved";

    }

    @PostMapping("saveAppointment")
public String saveAppointment (@RequestBody Appointment appointment){
    appointmentRepo.save(appointment);
    return "appointment saved";

}

@GetMapping({"getById/{id}"})
public Optional<Appointment>getById(@PathVariable Integer id){
    return  appointmentRepo.findById(id);

}

}
