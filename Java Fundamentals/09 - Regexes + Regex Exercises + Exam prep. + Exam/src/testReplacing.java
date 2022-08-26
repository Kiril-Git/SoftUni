import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testReplacing {
    public static void main(String[] args) {

        String regex = "[A-Za-z]+";
        String text = "Hello Java";

        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(text);

        String res = match.replaceAll("hi");            // hi hi
        String res2 = match.replaceFirst("hi");         // hi Java


        System.out.println(res);
        System.out.println(res2);
    }
}
