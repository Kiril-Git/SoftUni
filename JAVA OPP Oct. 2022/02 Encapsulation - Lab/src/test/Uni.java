package test;

import java.util.Collections;
import java.util.List;

public class Uni {

    private String name;
    private List<Person> students;

    public Uni(String name, List<Person> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Person> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
