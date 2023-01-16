import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] line = input.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        map.put('N', 0);
        map.put('S', 0);
        map.put('E', 0);
        map.put('W', 0);

        int counter = 0;

        for (int i = 0; i < line.length; i++) {

            char temp =  line[i];

            if (temp == 'N' || temp == 'S' || temp == 'E' || temp == 'W' );


        }
        System.out.println(counter);
    }
}
