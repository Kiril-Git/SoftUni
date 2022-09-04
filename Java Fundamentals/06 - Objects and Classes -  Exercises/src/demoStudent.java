import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demoStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student st1 = new Student("Donga", 23.9);
        Student st2 = new Student("Buzema", 23);
        Student st3 = new Student("Kozhata", 17);

        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3));

        students.forEach(st -> System.out.println(st.getData()));

        System.out.println("Sorted: ↓");
        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.avGrade, s1.avGrade))     //  First s2.avGrade,
                                                      // then s1.avGrade to compare in descending order.
                .forEach(student -> System.out.println(student.getData()));


    }
}
