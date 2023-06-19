package ru.hogwarts.school.Service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {
    private final HashMap<Long, Student> students = new HashMap<>();

    private long lastId = 0;

    public Student addStudent(Student student) {
        student.setId(lastId++);
        students.put(lastId, student);
        return student;
    }

    public Student findStudent(long id) {
        return students.get(id);
    }

    public Student editStudent(Student student) {
        if (students.containsKey(student.getId())) {
            students.put(student.getId(), student);
            return student;
        }
        return null;
    }

    public Student removeStudent(long id) {
        return students.remove(id);

    }
    public Collection<Student> studentByAge(int age) {
        List<Student> list = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getAge() == age) {
                list.add(student);
            }
        }
        return list;
    }

    public  Collection<Student>  getAll() {
        return students.values();
    }
}
