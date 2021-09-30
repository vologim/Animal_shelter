
package com.golovackii.mikhail.demo.repository;

import com.golovackii.mikhail.demo.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<Volunteer, Integer>{
    
}
