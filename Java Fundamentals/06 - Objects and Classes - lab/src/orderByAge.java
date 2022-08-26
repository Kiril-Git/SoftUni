import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class orderByAge {
    static class Persona {

        //    Характеристики -> полета      better set as private
        private String name;
        private String id;
        private int age;

        //    Конструктор -> създаваме обекти - public
        public Persona(String name, String id, int age){

//        нов обект
            this.name = name ;
            this.id = id;
            this.age = age;
        }
//    Methods:

        public String getName() {
            return this.name;
        }
        public String getId(){
            return this.id;
        }
        public int getAge() {
            return this.age;
        }
        //                              "{first name} {second name}: {grade}"
        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Persona> list = new ArrayList<>();

        while (!input.equals("End")){

            String[] inputLn = input.split(" ");

            String name = inputLn[0];
            String id = inputLn[1];
            int age = Integer.parseInt(inputLn[2]);

            Persona persona = new Persona(name, id, age);

            list.add(persona);

            list.sort(Comparator.comparingInt(Persona::getAge));

            input = scanner.nextLine();
        }
        for (Persona el : list){
            System.out.println(el.toString());
        }
    }
}
