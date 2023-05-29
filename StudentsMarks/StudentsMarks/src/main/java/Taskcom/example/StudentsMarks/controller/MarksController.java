package Taskcom.example.StudentsMarks.controller;

import Taskcom.example.StudentsMarks.entity.Marks;
import Taskcom.example.StudentsMarks.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class MarksController {

@Autowired
private MarksRepository marksRepository;
    @GetMapping("/Marks")
    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }
    @PostMapping("/Marks")
    public String Students(@RequestBody Marks marks) {
        marksRepository.save(marks);
        return "add Successfully";
    }

    @DeleteMapping("/Marks")
    public String deleteById(@RequestParam(value = "id") int id) {
        var notes = marksRepository.findById(id);
        if (notes.isPresent()) {
            marksRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Note Id not found");
        }

        return "Delete by id called";
    }
}
