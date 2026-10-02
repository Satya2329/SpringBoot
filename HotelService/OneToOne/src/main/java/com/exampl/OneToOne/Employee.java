package com.exampl.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "com.exampl.OneToOne.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
