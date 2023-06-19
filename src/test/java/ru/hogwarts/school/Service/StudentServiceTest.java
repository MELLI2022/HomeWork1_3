package ru.hogwarts.school.Service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hogwarts.school.model.Student;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;


class StudentServiceTest {
//    StudentService studentService;
//
//    @BeforeEach
//    public void beforeEach(){
//        studentService.addStudent(new Student(1L, "Гарри", 18));
//        studentService.addStudent(new Student(2L, "Рон", 17));
//        studentService.addStudent(new Student(3L, "Гермиона", 16));
//    }
////    @AfterEach
////    public void afterEach(){
////        new HashSet<>(studentService.getAll()).forEach(studentService :: removeStudent);
////    }
//
//    @Test
//    void addStudent() {
//        Student st = new Student(4L, "Драко", 18);
//
//        assertThat(studentService.addStudent(st))
//                .isEqualTo(st)
//                .isIn(studentService.getAll());
//    }
//
//
//    @Test
//    void findStudent() {
//        Student student = new Student(3L, "Гермиона", 16);
//        Assertions.assertThat(studentService.findStudent(3))
//                .isEqualTo(student)
//                .isIn(studentService.getAll());
//    }
////    @Test
////    void findStudentNegativeTest() {
////        Student student = new Student(5L, "Джинни", 16);
////        Assertions.assertThat(studentService.findStudent(5))
////                .isNotEqualTo(student)
////                .isNot(studentService.getAll());
////    }
//
//
//    @Test
//    void editStudent() {
//    }
//
//    @Test
//    void removeStudent() {
//        Student student = new Student(1L, "Гарри", 18);
//
//        assertThat(studentService.removeStudent(student.getId()))
//                .isEqualTo(student)
//                .isNotIn(studentService.getAll());
//    }
//
//    @Test
//    void studentByAge() {
//    }
//
//    @Test
//    void getAll() {
//        assertThat(studentService.getAll())
//                .hasSize(3)
//                .containsExactlyInAnyOrder(
//                        new Student(1L, "Гарри", 18),
//                        new Student(2L, "Рон", 17),
//                        new Student(3L, "Гермиона", 16)
//
//                );
//    }
}