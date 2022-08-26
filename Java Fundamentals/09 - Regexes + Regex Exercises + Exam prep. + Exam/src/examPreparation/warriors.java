package examPreparation;

import java.util.Scanner;

public class warriors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String rawFormula = scanner.nextLine();

        while (!rawFormula.equals("For Azeroth")){

            String[] line = rawFormula.split(" ");

            String command = line[0];

            switch (command){

                case "Target":
                    if (line[1].equals("Change")) {
                        String value = line[2];
                        if (sb.toString().contains(value)) {
                            String sbNew = sb.toString().replaceAll(value, line[3]);
                            sb.setLength(0);
                            sb.append(sbNew);
                            System.out.println(sb.toString());
                        } else {
                            System.out.println(sb.toString());
                        }
                    }
                    else  if (line[1].equals("Remove")) {
                        String value = line[2];
                        if (sb.toString().contains(value)) {
                            String sbNew = sb.toString().replaceAll(value, "");
                            sb.setLength(0);
                            sb.append(sbNew);
                            System.out.println(sb.toString());
                        } else {
                            rawFormula = scanner.nextLine();
                            continue;
                        }
                    }
                    break;
                case "GladiatorStance":
                    String temp = sb.toString().toUpperCase();
                    sb.setLength(0);
                    sb.append(temp);

                    System.out.println(sb.toString());
                    break;
                case "DefensiveStance":
                    String tempL = sb.toString().toLowerCase();
                    sb.setLength(0);
                    sb.append(tempL);

                    System.out.println(sb.toString());
                    break;
                case "Dispel":
                    int index = Integer.parseInt(line[1]);
                    if (index >= 0 & index < sb.length()) {
                        sb.deleteCharAt(index);
                        sb.insert(index, line[2]);
                        System.out.println("Success!");
                    }
                    else {
                        System.out.println("Dispel too weak.");
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
            }
            rawFormula = scanner.nextLine();
        }
    }
}
