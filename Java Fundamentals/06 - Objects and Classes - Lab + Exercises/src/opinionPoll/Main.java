package opinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>(); 

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] inputLn = scanner.nextLine().split(" ");

            String name = inputLn[0];
            int years = Integer.parseInt(inputLn[1]);

            if (years > 30){
                Person person = new Person(name, years);
                
                personList.add(person);
            }
        }
        for (Person el : personList) {

            System.out.println(el.getName() + " - " + el.getYears());
        }
    }
}
