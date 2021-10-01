
package com.golovackii.mikhail.demo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
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
@Table(name = "volunteers")
public class Volunteer extends BaseEntity{
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "date_birth")
    private LocalDate dateBirth;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "number_phone")
    private String numberPhone;
    
    @Column(name = "specification")
    private String specification;
    
    @OneToMany(mappedBy = "volunteer")
    @JsonBackReference
    @JsonIgnore
    private List<Pet> pets;
    
}
