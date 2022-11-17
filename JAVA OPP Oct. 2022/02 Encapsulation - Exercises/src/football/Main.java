package football;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Team> teamMap = new LinkedHashMap<>();

        while (!"END".equals(input)){
            String[] line = input.split(";");

            String command = line[0];
            String teamName = line[1];

            try {
            switch (command) {
                case "Team":
                    teamMap.put(teamName, new Team(teamName));
                    break;
                case "Add":
                    String playerName = line[2];
                    int endurance = Integer.parseInt(line[3]);
                    int sprint = Integer.parseInt(line[4]);
                    int dribble = Integer.parseInt(line[5]);
                    int passing = Integer.parseInt(line[6]);
                    int shooting = Integer.parseInt(line[7]);

                    if (!teamMap.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.\n", teamName);
                    } else {
                        Player player = new Player(
                                playerName, endurance, sprint, dribble, passing, shooting);
                        teamMap.get(teamName).addPlayer(player);
                    }
                    break;
                case "Remove":
                    String playerToRemove = line[2];

                    teamMap.get(teamName).removePlayer(playerToRemove);
                    break;

                case "Rating":
                    if (!teamMap.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.\n", teamName);
                    } else {
                        System.out.printf("%s - %d\n", teamName, Math.round(teamMap.get(teamName).getRating()));
                    }
                    break;
            }
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            input = scanner.nextLine();
        }
    }
}
