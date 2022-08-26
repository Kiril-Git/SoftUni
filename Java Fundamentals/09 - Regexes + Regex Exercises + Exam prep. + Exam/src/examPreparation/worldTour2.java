package examPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class worldTour2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        Pattern patt = Pattern.compile("^(?<command>[ ?A-Za-z]+)(?<delimiter>[:])" +
                "(?<ind>[\\w]*)\\2(?<ind2>[\\w]*)$");

        while (!input.equals("Travel")){
            Matcher match = patt.matcher(input);

            String[] line = input.split(":");
            String command = line[0];
            String value1 = line[1];
            String value2 = line[2];

//            if (match.find()) {
//                 command = match.group(1);
//                 value1 = match.group(3);
//                 value2 = match.group(4);
//            }
            switch (command){

                case "Add Stop":
                    int index = Integer.parseInt(value1);
                    if (index >= 0 & index < sb.length()) {
                        sb.insert(index, value2);

                        System.out.println(sb.toString());
                    }
                    break;
                case "Remove Stop":
                    int index1 = Integer.parseInt(value1);
                    int index2 = Integer.parseInt(value2);

                    if (index1 >=0 & index2 < sb.length()) {

                        sb.delete(index1, index2 + 1);
                        System.out.println(sb.toString());
                    }
                    break;
                case "Switch":
                    if (sb.toString().contains(value1)) {
                        String sbNew = sb.toString().replaceAll(value1, value2);
                        sb.setLength(0);
                        sb.append(sbNew);

                        System.out.println(sb.toString());
                    }
                    else {
                        System.out.println(sb.toString());
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", sb.toString());
    }
}
