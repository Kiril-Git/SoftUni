import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students2 {
    static class Students{

        String fName;
        String surName;
        String age;
        String town;

        public Students (String fName, String surName, String age, String town){
            this.fName = fName;
            this.surName = surName;
            this.age = age;
            this.town = town;
        }
        public String getfName() {
            return this.fName;
        }
        public String getSurName() {
            return this.surName;
        }
        public String getAge() {
            return this.age;
        }
        public String getTown() {
            return this.town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Students> studentsList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] studentsArr = input.split(" ");

            String fName = studentsArr[0];
            String surName = studentsArr[1];
            String age = studentsArr[2];
            String town = studentsArr[3];

            Students student = new Students(fName, surName, age, town);

            studentsList.add(student);

            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Students el : studentsList){

            if (el.getTown().equals(searchTown)){

                System.out.printf("%s %s is %s years old\n",
                        el.getfName(), el.getSurName(), el.age);
            }
        }
    }
}


