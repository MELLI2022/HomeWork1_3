package ru.hogwarts.school.Service;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.*;

@Service
public class FacultyService {

    private final HashMap<Long, Faculty> faculties = new  HashMap<>();

    private long lastId = 0;

    public Faculty addFaculty(Faculty faculty){//add
        faculty.setId(lastId++);
        faculties.put(lastId, faculty);
        return faculty;
    };
    public Faculty findFaculty(long id){
        return faculties.get(id);
    }
    public Faculty editFaculty(Faculty faculty){
        if (faculties.containsKey(faculty.getId())) {
            faculties.put(faculty.getId(), faculty);
            return faculty;
        }
        return null;
    };
    public Faculty deleteFaculty(long id){
        return faculties.remove(id);
    }
    public Collection<Faculty> facultyByColor(String color) {
        List<Faculty> list = new ArrayList<>();
        for (Faculty faculty : faculties.values()) {
            if (Objects.equals(faculty.getColor(), color)) {
                list.add(faculty);
            }
        }
        return list;
    }
}