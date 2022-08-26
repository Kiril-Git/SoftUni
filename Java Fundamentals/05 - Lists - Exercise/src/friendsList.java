import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class friendsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendsList = Arrays
                .stream(scanner.nextLine().split(","))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        int blacklisted = 0;
        int lost = 0;

        while (!input.equals("Report")) {

            String[] commandLn = input.split(" ");

            String command = commandLn[0];
            String value1 = commandLn[0];

            String temp = "";
            String temp2 = "";

            switch (command){
                case "Blacklist":
                    temp = "Blacklisted";
                    String name = commandLn[1];
                    if (friendsList.contains(name)){
                        friendsList.set(friendsList.indexOf(name), temp);
                        blacklisted++;
                        System.out.printf("%s was blacklisted.\n", name);

                    }
                    else {
                        System.out.println(name + " was not found.");
                    }
                    break;

                case "Error":
                    int index = Integer.parseInt(commandLn[1]);
                    if (friendsList.get(index).equals("Lost")
                            || friendsList.get(index).equals("Blacklisted")){
                        break;
                    }
                    if (friendsList.size() > index & index >= 0){
                        temp = "Lost";
                        temp2 = friendsList.get(index);
                        friendsList.set(index, temp);
                        lost++;
                    }
                    System.out.println(temp2 + " was lost due to an error.");
                    break;

                case "Change":

                    int ind = Integer.parseInt(commandLn[1]);

                    if (friendsList.size() > ind & ind >= 0) {
                        String nm = friendsList.get(ind);

                        String userName = commandLn[2];

                        friendsList.set(ind, userName);
                        System.out.println(nm + " changed his username to " + userName + ".");
                        break;
                    }
            }
            input = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + blacklisted);
        System.out.println("Lost names: " + lost);
//        friendsList.forEach(el -> System.out.print(el + ""));

       System.out.println(friendsList.toString().replaceAll("[\\[\\],]",  ""));
    }
}
//                         https://youtu.be/Anu1izx-1AE

//  https://judge.softuni.org/Contests/Submissions/View/27764219
