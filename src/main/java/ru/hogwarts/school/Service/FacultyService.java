package ru.hogwarts.school.Service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.Entity.Faculty;
import ru.hogwarts.school.Entity.Student;
import ru.hogwarts.school.repository.FacultyRepository;
import ru.hogwarts.school.repository.StudentRepository;

import java.util.*;

@Service
public class FacultyService {

 //   private final HashMap<Long, Faculty> faculties = new  HashMap<>();

   // private long lastId = 0;
    private final FacultyRepository facultyRepository;
    private final StudentRepository studentRepository;


    public FacultyService(FacultyRepository facultyRepository, StudentRepository studentRepository) {
        this.facultyRepository = facultyRepository;
        this.studentRepository = studentRepository;
    }

    public Faculty addFaculty(Faculty faculty){//add
        faculty.setId(null);
        return facultyRepository.save(faculty);
    };
    public Faculty findFaculty(long id){
        return facultyRepository.findById(id).get();
    }
    public Faculty editFaculty(Faculty faculty){
        return facultyRepository.save(faculty);
    };
    public void deleteFaculty(long id){
         facultyRepository.deleteById(id);
    }
    public Collection<Faculty> facultyByColor(String color) {
        return facultyRepository.findFacultyByColor(color);
    }

    public List<Faculty> findByColorFaculty(String color) {
        return facultyRepository.findByColorFaculty(color );
    }
    public List<Student> getStudentsByFacultyId(Long id){
        return studentRepository.getStudentsByFaculty_Id(id);
    }


}