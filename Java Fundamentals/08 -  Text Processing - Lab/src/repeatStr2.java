import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatStr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

            List<String> beady = new ArrayList<>();
            String temp = "";
            int reps = 0;

            for (int i = 0; i < input.length ; i++) {
                temp = input[i];
                reps = temp.length();

                String posleden = repsStr(temp, reps);
                beady.add(posleden);
            }
            System.out.println(String.join("", beady));
    }
    public static String repsStr(String s, int reps){
        String tempStr = "";
        for (int i = 0; i < reps; i++) {
            tempStr += s;
        }
            return tempStr;
    }
}
