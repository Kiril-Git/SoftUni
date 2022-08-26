import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testExers {
    public static void main(String[] args) {

        String regex = "(?<productName>[A-Za-z]+)(?<price>[\\d]+)";

        String text = "Product123item4466";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));               //  (1) or "productName"
            System.out.println(matcher.group("price"));

        }

    }
}

//          watch?v=8kf0tIHZTrM
