package com.example.demo.employees;

import javax.persistence.*;
import java.util.Set;

// Mapping a Many to one self-join

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    // how many employees to managers?
    // id | name | manager_id
    @ManyToOne
    private Employee manager;

    // how many mangers to employees?
    // who owns the data?
    @OneToMany(mappedBy = "manager")
    private Set<Employee> employees;

    public Employee() {
        // empty constructor required by hibernate (and sometimes json)
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public long getId() {
        return id;
    }
}
