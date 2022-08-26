import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class softUniBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?" +
                                    "\\|(?<quantity>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(regex);

        String name = "";
        String product = "";
        double price = 0;
        int quantity = 0;
        double sum = 0;
        double total = 0;

        while (!input.equals("end of shift")){

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                name = matcher.group(1);
                product = matcher.group(2);
                quantity = Integer.parseInt(matcher.group(3));
                price = Double.parseDouble(matcher.group(4));

                sum = quantity * price;
                total += sum;

                System.out.printf("%s: %s - %.2f\n", name, product, sum);
            }

            sum = 0;
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f\n", total);
    }
}
//  DaqSysBR