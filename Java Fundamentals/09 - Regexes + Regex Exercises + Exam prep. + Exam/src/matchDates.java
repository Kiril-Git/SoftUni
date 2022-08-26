import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patt = Pattern.compile("\\b(?<day>\\d{2})([-\\/.])" +
                                "(?<month>[A-Z][a-z]{2})(?:\\2)(?<year>[0-9]{4})\\b");

        Matcher match = patt.matcher(input);

        while (match.find()){

            String date = match.group();
            String day = match.group("day");
            String month = match.group("month");
            String year = match.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s\n", day, month, year);
        }
    }
}
