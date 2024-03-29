package com.example.MockInterview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int rollNo;

    @Column(name = "StudentName")
    private String name;

    @Column(name = "CollegeName")
    private String collegeName;


}
