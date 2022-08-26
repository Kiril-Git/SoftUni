package examPreparation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class destinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patt = Pattern.compile("(?<delimiter>[=\\/])(?<destination>[A-Z]+[A-Za-z]{2,}+)\\1");

        Matcher match = patt.matcher(input);

        List<String> destinations = new LinkedList<>();

        int pointsTr = 0;

        while (match.find()){

            String name = match.group(2);
            destinations.add(name);

            pointsTr = destinations.stream().mapToInt(String::length).sum();

//            for (int i = 0; i < name.length(); i++) {

//                pointsTr++;
//            }

//            String dest = String.join(", ", destinations);

        }
        System.out.println("Destinations: " + String.join(", ", destinations));

        System.out.println("Travel Points: " + pointsTr);
    }
}
