package ru.hogwarts.school.Service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.Entity.Faculty;
import ru.hogwarts.school.Entity.Student;
import ru.hogwarts.school.repository.StudentRepository;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {
//    private final HashMap<Long, Student> students = new HashMap<>();
//
//    private long lastId = 0;
private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Student addStudent(Student student) {
        student.setId(null);
        return studentRepository.save(student);
    }

    public Student findStudent(long id) {
        return studentRepository.findById(id).get();
    }

    public Student editStudent(Student student) {
       return studentRepository.save(student);
    }

    public void removeStudent(long id) {
      studentRepository.deleteById(id);

    }
    public Collection<Student> studentByAge(int age) {
       return studentRepository.findStudentByAge(age);
    }
    public List<Student> findByAgeBetween(int age, int age2) {
        return studentRepository.findByAgeBetween(age, age2 );
    }
    public Faculty getFacultyByStudentId(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new FacultyNotFoundException(id));
        return student.getFaculty();
    }

}
