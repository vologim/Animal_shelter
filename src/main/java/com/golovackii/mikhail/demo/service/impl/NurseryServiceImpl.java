
package com.golovackii.mikhail.demo.service.impl;

import com.golovackii.mikhail.demo.model.Nursery;
import com.golovackii.mikhail.demo.repository.NurseryRepository;
import com.golovackii.mikhail.demo.service.NurseryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NurseryServiceImpl implements NurseryService {

    private final NurseryRepository nurseryRepository;

    @Autowired
    public NurseryServiceImpl(NurseryRepository nurseryRepository) {
        this.nurseryRepository = nurseryRepository;
    }
            
    @Override
    public List<Nursery> getAll() {
        return nurseryRepository.findAll();
    }

    @Override
    public Nursery getById(Integer id) {
        return nurseryRepository.getById(id);
    }

    @Override
    public void save(Nursery obj) {
        nurseryRepository.save(obj);
    }

    @Override
    public void delete(Integer id) {
        nurseryRepository.deleteById(id);
    }
    
}
