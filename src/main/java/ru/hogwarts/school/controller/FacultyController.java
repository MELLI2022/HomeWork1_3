package ru.hogwarts.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.hogwarts.school.Service.FacultyService;
import ru.hogwarts.school.Entity.Faculty;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("faculty")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }
    @GetMapping("{id}")//GET http://localhost:8080/faculties/2
    public ResponseEntity<Faculty> getFaculty(@PathVariable Long id){
        Faculty faculty = facultyService.findFaculty(id);
        if (faculty == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(faculty);
    }
    @PostMapping //POST http://localhost:8080/faculties
    public Faculty createFaculty(@RequestBody Faculty faculty){
        return facultyService.addFaculty(faculty);
    }
    @PutMapping//PUT http://localhost:8080/faculties
    public ResponseEntity<Faculty> editFaculty(@RequestBody Faculty faculty){
        Faculty fondFaculty = facultyService.editFaculty(faculty);
        if (fondFaculty == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(fondFaculty);
    }
    @DeleteMapping("{id}")//DELETE http://localhost:8080/faculties/2
    public ResponseEntity removeFaculty(@PathVariable Long id){
        facultyService.deleteFaculty(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity <Collection<Faculty>>facultyByColor(@RequestParam(required = false) String color){
        if (color != null && !color.isBlank()){
            return ResponseEntity.ok(facultyService.facultyByColor(color));
        }
        return ResponseEntity.ok(Collections.emptyList());
    }


}
