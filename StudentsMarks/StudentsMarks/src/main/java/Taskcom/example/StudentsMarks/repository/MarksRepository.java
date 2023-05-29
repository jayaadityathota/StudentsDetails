package Taskcom.example.StudentsMarks.repository;

import Taskcom.example.StudentsMarks.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks,Integer> {
}
