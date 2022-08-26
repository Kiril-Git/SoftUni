package examPreparation;

import java.util.Locale;
import java.util.Scanner;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String rawFormula = scanner.nextLine();

        while (!rawFormula.equals("Generate")){

            String[] line = rawFormula.split(">>>");

            String command = line[0];

            switch (command){

                case "Contains":
                    String value = line[1];
                    if (sb.toString().contains(value)){
                        System.out.println(sb.toString());
                    }
                    else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String type = line[1];
                    int inedex1 = Integer.parseInt(line[2]);
                    int inedex2 = Integer.parseInt(line[3]);

                    if (type.equals("Upper")){
                     String temp = sb.substring(inedex1, inedex2).toUpperCase();
                     sb.delete(inedex1, inedex2);
                     sb.insert(inedex1, temp);
                    }
                    if (type.equals("Lower")){
                        String temp = sb.substring(inedex1, inedex2).toLowerCase();
                        sb.delete(inedex1, inedex2);
                        sb.insert(inedex1, temp);
                    }
                    System.out.println(sb.toString());
                    break;
                case "Slice":
                    int startInd = Integer.parseInt(line[1]);
                    int endInd = Integer.parseInt(line[2]);

                    sb.delete(startInd, endInd);
                    System.out.println(sb.toString());
                    break;
            }
            rawFormula = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + sb.toString());
    }
}
