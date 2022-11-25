package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Identifiable> identifiableList = new ArrayList<>();

        while (!"End".equals(input)){

            String[] line = input.split(" ");

            Identifiable identifiable = null;
            String id = null;

            switch (line.length){
                case 2:
                    String model = line[0];
                     id = line[1];
                    identifiable = new Robot(model, id);
                    break;

                case 3:
                    String name = line[0];
                    int age = Integer.parseInt(line[1]);
                    id = line[2];

                    identifiable = new Citizen(name, age, id);
            }
            if (identifiable != null){
                identifiableList.add(identifiable);
            }
            input = scanner.nextLine();
        }
        String fakeIdSuffix = scanner.nextLine();

        identifiableList.stream().map(Identifiable::getId).filter(id -> id.endsWith(fakeIdSuffix))
                .forEach(System.out::println );
    }
}
