
package com.golovackii.mikhail.demo.service.impl;

import com.golovackii.mikhail.demo.model.Volunteer;
import com.golovackii.mikhail.demo.repository.VolunteerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.golovackii.mikhail.demo.service.VolunteerService;
import org.springframework.stereotype.Service;

@Service
public class VolunteerServiceImpl implements VolunteerService{

    private final VolunteerRepository volunteerRepository;

    @Autowired
    public VolunteerServiceImpl(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }
     
    @Override
    public List<Volunteer> getAll() {     
        return volunteerRepository.findAll();
    }

    @Override
    public Volunteer getById(Integer id) {
        return volunteerRepository.getById(id);
    }

    @Override
    public void save(Volunteer obj) {
        volunteerRepository.save(obj);
    }

    @Override
    public void delete(Integer id) {
        volunteerRepository.deleteById(id);
    }

}
