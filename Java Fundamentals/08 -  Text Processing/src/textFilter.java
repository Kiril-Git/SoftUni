import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] key = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        String beady = "";
        String temp = "";
        int reps = 0;

            for (int i = 0; i < key.length ; i++) {
                temp = key[i];
                reps = temp.length();

                for (int j = 0; j < reps; j++) {
                    beady += "*";
                }
                text = text.replace(temp, beady);
                beady = "";
            }
        System.out.println(text);
    }
}
