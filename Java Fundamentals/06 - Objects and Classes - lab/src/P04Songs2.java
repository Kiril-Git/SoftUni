import java.util.Scanner;

public class P04Songs2 {

    static class Song{

        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList){
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Song song = new Song();
        song.setTypeList("Java List");
        song.setName("la-La-Lend");
        song.setTime("3:45");

        System.out.println();




    }
}
