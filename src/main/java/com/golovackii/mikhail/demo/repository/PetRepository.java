
package com.golovackii.mikhail.demo.repository;

import com.golovackii.mikhail.demo.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Integer>{
    
}
