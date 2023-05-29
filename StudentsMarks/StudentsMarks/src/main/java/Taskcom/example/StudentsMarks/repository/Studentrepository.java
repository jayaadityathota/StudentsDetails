package Taskcom.example.StudentsMarks.repository;

import Taskcom.example.StudentsMarks.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Students,Integer> {
}
