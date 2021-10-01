
package com.golovackii.mikhail.demo.service;

import java.util.List;

public interface BaseService<T>{
    
    List<T> getAll();
    
    T getById(Integer id);
    
    void save(T obj);
    
    void delete(Integer id);
    
}
