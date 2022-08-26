import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testSingleMatchCheck {
    public static void main(String[] args) {

        String text = "Andy: 123";
        String pattern = "([A-Z][a-z]+): (?<number>\\d+)";

        Pattern regex = Pattern.compile(pattern);
        Matcher match = regex.matcher(text);

        System.out.println(match.find());
        System.out.println(match.group());
        System.out.println(match.group(0));
        System.out.println(match.group(1));
        System.out.println(match.group(2));
        System.out.println(match.group("number"));

    }
}
