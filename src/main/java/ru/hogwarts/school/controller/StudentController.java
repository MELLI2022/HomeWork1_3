package ru.hogwarts.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.Service.StudentService;
import ru.hogwarts.school.model.Student;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("{id}")//GET http://localhost:8080/students/2
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student student = studentService.findStudent(id);
        if (student == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping //POST http://localhost:8080/students
    public Student postStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping//PUT http://localhost:8080/students
    public ResponseEntity<Student> editStudent(@RequestBody Student student){
        Student fondStudent = studentService.editStudent(student);
        if (fondStudent == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(fondStudent);
    }

    @DeleteMapping("{id}")//DELETE http://localhost:8080/students/2
    public Student removeStudent(@PathVariable Long id){
        return studentService.removeStudent(id);
    }

    @GetMapping
    public ResponseEntity <Collection<Student>>studentByAge(@RequestParam(required = false) int age){
        if (age > 0){
            return ResponseEntity.ok(studentService.studentByAge(age));
        }
        return ResponseEntity.ok(Collections.emptyList());
    }
}
