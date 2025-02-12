package manyToManyDemo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    public Employee(int id, String name, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.projects = projects;
    }

    public Employee() {

    }

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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

     @Id
     private int id;
     @Column(name="employee_name")
     private String name;

     @ManyToMany
     @JoinTable(
             name = "employee_project", // Name of the join table
             joinColumns = @JoinColumn(name = "employee_id"), // Foreign key referencing Employee
             inverseJoinColumns = @JoinColumn(name = "project_id") // Foreign key referencing Project
     )
     private List<Project> projects;
     //join table help use to change name of multiple coloums (chnage internal coloumns from the table)

}
