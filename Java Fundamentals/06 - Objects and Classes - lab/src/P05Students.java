import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Students{

        String studentsList;
        String fName;
        String surName;
        String age;
        String town;

        public void setStudentsList(String studentsList) {
            this.studentsList = studentsList;
        }
        public String getStudentsList() {
            return studentsList;
        }

        public void setfName(String fName) {
            this.fName = fName;
        }
        public String getfName() {
            return fName;
        }

        public void setSurName(String surName) {
            this.surName = surName;
        }
        public String getSurName() {
            return surName;
        }

        public void setAge(String age) {
            this.age = age;
        }
        public String getAge() {
            return age;
        }

        public void setTown(String town) {
            this.town = town;
        }
        public String getTown() {
            return town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

        List<Students> listStudents = new ArrayList<>();

        while (!input.equals("end")) {

            String[] studentsArr = scanner.nextLine().split(" ");

            String fName = studentsArr[0];
            String surName = studentsArr[1];
            String age = studentsArr[2];
            String town = studentsArr[3];


         /*   Song currentSong = new Song();
            currentSong.setTypeList(inputType);
            currentSong.setName(inputName);
            currentSong.setTime(inputTime);

            listSongs.add(currentSong);

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for(Song item : listSongs){
                System.out.println(item.getName());
            }
        }
        else{
            for(Song item : listSongs){
                System.out.println(item.getName());
            }*/
        }
    }
}


