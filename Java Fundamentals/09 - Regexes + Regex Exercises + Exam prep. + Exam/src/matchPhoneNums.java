import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPhoneNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patt = Pattern.compile("\\+359([- ])2\\1[0-9]{3}\\1[0-9]{4}\\b");

        Matcher match = patt.matcher(input);

        List<String> phoneNumsList = new ArrayList<>();

        while (match.find()){

            String phoneNum = match.group();

            phoneNumsList.add(phoneNum);

        }
        System.out.println(String.join(", ", phoneNumsList));

    }
}
