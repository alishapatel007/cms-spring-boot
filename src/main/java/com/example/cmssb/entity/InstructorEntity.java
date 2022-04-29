package com.example.cmssb.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class InstructorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Size(max = 50)
    private String name;
    @Column
    @Size(max = 50)
    private String email;
    @Column
    @Size(max = 50)
    private String username;
    @Column
    @Size(max = 50)
    private String password;
    private Double salary;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "instructor_course",
            joinColumns = { @JoinColumn(name = "instructor_id") },
            inverseJoinColumns = { @JoinColumn(name = "course_id") })
    private Set<CourseEntity> courses;
}
