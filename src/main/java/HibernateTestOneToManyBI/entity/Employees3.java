package HibernateTestOneToManyBI.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees3")
public class Employees3 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary")
    private int salary;

//    @Column(name = "department_id")
//    private int departmentId;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Departments departments;


    public Employees3() {
    }

    public Employees3(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public int getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(int departmentId) {
//        this.departmentId = departmentId;
//    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Employees3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", departmentId=" +
                '}';
    }
}
