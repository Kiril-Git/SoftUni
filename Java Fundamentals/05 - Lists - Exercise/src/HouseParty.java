import java.util.*;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> nameList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> commandLn = Arrays
                    .stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

            String name = commandLn.get(0);

            if (commandLn.get(2).equals("going!")) {
                if (nameList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    nameList.add(name);
                }
            }
            else if (commandLn.get(2).equals("not")){
                if (!nameList.contains(name)){
                    System.out.println(name + " is not in the list!");
                }
                else {
                    nameList.remove(name);
                }
            }
        }
//        System.out.println(nameList.toString().replaceAll("[\\[\\],]",  ""));
        nameList.forEach(el -> System.out.println(el + " "));
    }
}
//                         https://youtu.be/Anu1izx-1AE

