
package com.golovackii.mikhail.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "nurserys")
public class Nursery extends BaseEntity{
    
    @Column(name = "dept_name")
    private String deptName;
    
    @Column(name = "dept_address")
    private String deptAddress;
    
    @Column(name = "first_number_phone")
    private String firstNumberPhone;
    
    @Column(name = "second_number_phone")
    private String secondNumberPhone;
    
    @Column(name = "specification")
    private String specification;
    
    @OneToMany(mappedBy = "nursery")
    @JsonBackReference
    @JsonIgnore
    private List<Pet> pets;
    
}
