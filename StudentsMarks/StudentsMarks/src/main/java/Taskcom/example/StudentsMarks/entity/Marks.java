package Taskcom.example.StudentsMarks.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="marks")
public class Marks {
    @Id
    @Column(name="id")
    private  int id;
    @Column
    private int student_id;

    @Column
    private String telugu;
    @Column
    private String hindi;
    @Column
    private String english;
    @Column
    private String maths;
    @Column
    private String science;
    @Column
    private String social;


    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", telugu='" + telugu + '\'' +
                ", hindi='" + hindi + '\'' +
                ", english='" + english + '\'' +
                ", maths='" + maths + '\'' +
                ", science='" + science + '\'' +
                ", social='" + social + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marks marks = (Marks) o;
        return id == marks.id && student_id == marks.student_id && Objects.equals(telugu, marks.telugu) && Objects.equals(hindi, marks.hindi) && Objects.equals(english, marks.english) && Objects.equals(maths, marks.maths) && Objects.equals(science, marks.science) && Objects.equals(social, marks.social);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student_id, telugu, hindi, english, maths, science, social);
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public String getMaths() {
        return maths;
    }

    public void setMaths(String maths) {
        this.maths = maths;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getHindi() {
        return hindi;
    }

    public void setHindi(String hindi) {
        this.hindi = hindi;
    }

    public String getTelugu() {
        return telugu;
    }

    public void setTelugu(String telugu) {
        this.telugu = telugu;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
