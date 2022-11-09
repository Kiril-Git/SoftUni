package salaryIncrease2;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            people.add(new Person(input[0], input[1],
                    Integer.parseInt(input[2]), Double.parseDouble(input[3])));
        }

        double bonus = Double.parseDouble(sc.nextLine());
        for (Person el : people) {
            el.increaseSalary(bonus);
            System.out.println(el.toString());
        }
    }
}

