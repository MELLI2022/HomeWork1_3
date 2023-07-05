package ru.hogwarts.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hogwarts.school.Entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Collection<Student> findStudentByAge(int age);

    List<Student> findByAgeBetween(int age, int age2);

    List<Student> getStudentsByFaculty_Id(Long id);

}
