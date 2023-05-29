package Taskcom.example.StudentsMarks.controller;


import Taskcom.example.StudentsMarks.entity.Students;
import Taskcom.example.StudentsMarks.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private Studentrepository studentrepository;


    @GetMapping("/Students")

    public List<Students> getAllStudents() {
        return studentrepository.findAll();
    }
    @PostMapping("/Students")
    public String Students(@RequestBody Students students) {
        studentrepository.save(students);
        return "add Successfully";
    }

    @DeleteMapping("/Notes")
    public String deleteById(@RequestParam(value = "id") int id) {
        var notes = studentrepository.findById(id);
        if (notes.isPresent()) {
            studentrepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Id not found");
        }

        return "Delete by id called";
    }
}
