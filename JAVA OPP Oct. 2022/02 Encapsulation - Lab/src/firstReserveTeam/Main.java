package firstReserveTeam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Team team = new Team("Black Eagles");
//        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            team.addPlayer(new Person(input[0], input[1],
                    Integer.parseInt(input[2]), Double.parseDouble(input[3])));
        }
        System.out.printf("First team have %d players\n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players\n", team.getReserveTeam().size());
    }
}
