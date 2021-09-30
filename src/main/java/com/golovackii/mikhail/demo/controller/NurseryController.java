
package com.golovackii.mikhail.demo.controller;

import com.golovackii.mikhail.demo.model.Nursery;
import com.golovackii.mikhail.demo.service.impl.NurseryServiceImpl;
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
public class NurseryController {
    
    private final NurseryServiceImpl nurseryService;

    @Autowired
    public NurseryController(NurseryServiceImpl nurseryService) {
        this.nurseryService = nurseryService;
    }
    
    @GetMapping("/nursery")
    public List<Nursery> getAllNurserys(){
        List<Nursery> nurserys = nurseryService.getAll();
        
        return nurserys;
    }
    
    @GetMapping("/nursery/{id}")
    public Nursery getNursery(@PathVariable Integer id){
        Nursery nursery = nurseryService.getById(id);
        
        return nursery;
    }
    
    @PostMapping("/nursery")
    public Nursery saveNursery(@RequestBody Nursery nursery){
        nurseryService.save(nursery);
        
        return nursery;
    }
    
    @PutMapping("/nursery")
    public Nursery updateNursery(@RequestBody Nursery nursery){
        nurseryService.save(nursery);
        
        return nursery;
    }
    
    @DeleteMapping("/nursery/{id}")
    public void deleteNursery(@PathVariable Integer id){
        nurseryService.delete(id);
    }
    
}
