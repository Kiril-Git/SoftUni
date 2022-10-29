import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Course basics = new Course("Basics", 0, "First course");
        Course fundamentals = new Course("Fundamentals", 500, "Second course");
        Course advanced = new Course("Advanced", 500, "Third  course");

        List<Course> courseList = new ArrayList<>();

        courseList.add(basics);
        courseList.add(fundamentals);
        courseList.add(advanced);


        Arrays.stream(Courses.values()).forEach(e -> System.out.println(e.ordinal()));
    }
    public void printProgram(List<Courses> courses){

        Courses[] courses1 = Courses.values();

    }
}
