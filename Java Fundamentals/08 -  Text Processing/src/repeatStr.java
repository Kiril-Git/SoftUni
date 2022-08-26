import java.util.Scanner;

public class repeatStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

            String beady = "";
            String temp = "";
            int reps = 0;

            for (int i = 0; i < input.length ; i++) {
                temp = input[i];
                reps = temp.length();

                for (int j = 0; j < reps; j++) {
                    beady += temp;
                }
                reps = 0;
                temp = "";
            }
            System.out.println(beady);
    }
}
