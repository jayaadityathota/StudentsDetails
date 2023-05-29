package Taskcom.example.StudentsMarks.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="Students")
public class Students {

    @Id
    @Column(name="Id")
    private int id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private LocalDate dob;
    @Column
    private String parentsName;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private long phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dob=" + dob +
                ", parentsName='" + parentsName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && phone == students.phone && Objects.equals(firstname, students.firstname) && Objects.equals(lastname, students.lastname) && Objects.equals(dob, students.dob) && Objects.equals(parentsName, students.parentsName) && Objects.equals(address, students.address) && Objects.equals(city, students.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, dob, parentsName, address, city, phone);
    }

}
