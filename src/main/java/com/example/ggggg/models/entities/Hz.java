package com.example.ggggg.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "hz")
public class Hz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @Column
    public String name;

    public Hz() {

    }
}
