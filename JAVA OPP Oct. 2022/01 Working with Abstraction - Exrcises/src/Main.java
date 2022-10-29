import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person("Donga", "Stankov");
        Person p2 = new Person("Buzema", "Andonov");

        p2.setForename("Ivo");

        Person p3 = new Person("Kozhata", "Muletarovski");

        System.out.println(p2.getForename() + " " + p2.getSurname());

        System.out.println(Person.countOfPeople);


        System.out.println(Math.max(5, 6));
    }
}
