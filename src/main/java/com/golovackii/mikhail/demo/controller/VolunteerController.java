
package com.golovackii.mikhail.demo.controller;

import com.golovackii.mikhail.demo.model.Volunteer;
import com.golovackii.mikhail.demo.service.impl.VolunteerServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VolunteerController {
    
    private final VolunteerServiceImpl volunteerService;

    @Autowired
    public VolunteerController(VolunteerServiceImpl volunteerService) {
        this.volunteerService = volunteerService;
    }
    
    @GetMapping("/volunteers")
    public List<Volunteer> getAllVoloList(){
        List<Volunteer> volonteers = volunteerService.getAll();
        return volonteers;
    }
    
    @GetMapping("/volunteers/{id}")
    public Volunteer getVolunteer(@PathVariable Integer id){
        Volunteer volunteer = volunteerService.getById(id);
        
        return volunteer;
    }
    
    @PostMapping("/volunteers")
    public Volunteer saveVolunteer(@RequestBody Volunteer volunteer){
        volunteerService.save(volunteer);
        return volunteer;
    }
    
    @PutMapping("/volunteers")
    public Volunteer updateVolunteer(@RequestBody Volunteer volunteer){
        volunteerService.save(volunteer);
        return volunteer;
    }
    
    @DeleteMapping("/volunteers/{id}")
    public void deleteVolunteer(@PathVariable Integer id){
        volunteerService.delete(id);
    }
    
}
