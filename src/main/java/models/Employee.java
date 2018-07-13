package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(){

    }
    public Employee( String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" )
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstname) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastname) {
        this.lastName = lastName;
    }

    @Column(name = "salary") public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


