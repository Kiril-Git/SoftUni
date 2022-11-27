package birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Birthable> birthables = new ArrayList<>();

        List<Birthable> dateSuffixList = new ArrayList<>();

        while (!"End".equals(input)){

            String[] line = input.split(" ");

            String type = line[0];
            Birthable birthable;

            String name = null;
            String BDate = null;

            switch (type){
                case "Pet":
                    name = line[1];
                    BDate = line[2];
                    birthable = new Pet(name, BDate);
                    birthables.add(birthable);
                    break;

                case "Robot":
                    break;

                case "Citizen":
                    name = line[1];
                    BDate = line[4];
                    int age = Integer.parseInt(line[2]);
                    String id = line[3];
                    birthable = new Citizen(name, age, id, BDate);
                    birthables.add(birthable);
                    break;
//                default:
//                    throw new IllegalArgumentException("<no output>");
            }

            input = scanner.nextLine();
        }
        String dateSuffix = scanner.nextLine();

//            birthables.stream().map(Birthable::getBirthDate).filter(el -> el.endsWith(dateSuffix))
//                    .forEach(System.out::println);

        boolean isDateSuffix = false;
        for (Birthable el : birthables){
            if (el.getBirthDate().endsWith(dateSuffix)){
                System.out.println(el.getBirthDate());
                isDateSuffix = true;
            }
        }
        if (!isDateSuffix){
            System.out.println("<no output>");
        }
    }
}
