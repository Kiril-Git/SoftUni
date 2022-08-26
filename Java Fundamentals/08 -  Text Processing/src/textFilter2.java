import java.util.Scanner;

public class textFilter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] key = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

            for (String el : key) {

                if (text.contains(el)){
                    text = text.replace(el, reps("*", el.length()));
                }
            }
        System.out.println(text);
    }
    public static String reps (String s, int el){

        String beady = "";

        for (int i = 0; i < el; i++) {
            beady += "*";
        }
        return beady;
    }
}
//  5kXJwxq9