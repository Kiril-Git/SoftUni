import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

//        String regex = ">>(?<furnitureName>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";

        String regex = ">>(?<type>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";

        String type = "";
        double price = 0;
        int quantity = 0;
        double sum = 0;
        double total = 0;

        List<String> list = new ArrayList<>();

        while (!input.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {

            type = matcher.group(1);
            price = Double.parseDouble(matcher.group(2));
            quantity = Integer.parseInt(matcher.group(3));

            sum = quantity * price;
            total += sum;
            list.add(type);
        }
        sum = 0;
        input = scanner.nextLine();
        }
        if (list.size() > 0){
            System.out.println("Bought furniture:");

            for (String s : list) {
            System.out.println(s);
        }
        }
        System.out.printf("Total money spend: %.2f\n", total);
    }
}
//                    list.forEach(el -> System.out.println(el));

//                    list.forEach(el -> System.out::println);


//          watch?v=8kf0tIHZTrM
