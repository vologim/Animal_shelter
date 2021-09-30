
package com.golovackii.mikhail.demo.service.impl;

import com.golovackii.mikhail.demo.model.Pet;
import com.golovackii.mikhail.demo.repository.PetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.golovackii.mikhail.demo.service.PetService;

@Service
public class PetServiceImpl implements PetService{

    private final PetRepository petRepository;

    @Autowired
    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
        
    @Override
    public List<Pet> getAll() {
        return petRepository.findAll();
    }

    @Override
    public Pet getById(Integer id) {
        return petRepository.getById(id);
    }

    @Override
    public void save(Pet obj) {
        petRepository.save(obj);
    }

    @Override
    public void delete(Integer id) {
        petRepository.deleteById(id);
    }
    
}
