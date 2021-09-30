
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
@Table(name = "pets")
public class Pet extends BaseEntity{

    @Column(name = "type_pet")
    private String typePet;
    
    @Column(name = "pet_name")
    private String petName;
    
    @Column(name = "sex")
    private String sex;
    
    @Column(name = "date_birth")
    private LocalDate dateBirth;
    
    @Column(name = "type_wool")
    private String typeWool;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "breed")
    private String breed;
    
    @Column(name = "passport")
    private String passport;
    
    @Column(name = "specification")
    private String specification;
    
//    @ManyToOne
//    @JoinColumn(name = "id_volonteer")
//    private Volunteer idVolunteer;
    
}
