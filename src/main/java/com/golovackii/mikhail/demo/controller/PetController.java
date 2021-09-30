
package com.golovackii.mikhail.demo.controller;

import com.golovackii.mikhail.demo.model.Pet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.golovackii.mikhail.demo.service.impl.PetServiceImpl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PetController {
    
    private final PetServiceImpl petservice;

    @Autowired
    public PetController(PetServiceImpl petservice) {
        this.petservice = petservice;
    }
    
    @GetMapping("/pets")
    public List<Pet> getAllPets(){
        List<Pet> pets = petservice.getAll();
        
        return pets;
    }
    
    @GetMapping("/pets/{id}")
    public Pet getPet(@PathVariable Integer id){
        Pet pet = petservice.getById(id);
        
        return pet;
    }
    
    @PostMapping("/pets")
    public Pet savePet(@RequestBody Pet pet){
        petservice.save(pet);
        
        return pet;
    }
    
    @PutMapping("/pets")
    public Pet updatePet(@RequestBody Pet pet){
        petservice.save(pet);
        
        return pet;
    }
    
    @DeleteMapping("/pets/{id}")
    public void deletePet(@PathVariable Integer id){
        petservice.delete(id);
    }
    
}
