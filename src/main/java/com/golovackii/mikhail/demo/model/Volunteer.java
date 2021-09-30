
package com.golovackii.mikhail.demo.model;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    
//    @OneToMany(mappedBy = "idVolunteer")
//    private List<Pet> pets;
    
}
