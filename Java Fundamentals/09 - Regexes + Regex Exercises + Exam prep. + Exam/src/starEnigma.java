import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[STARstar]";
        String regex2 = "^[^@\\-!:>]*@(?<namePl>[A-Z][a-z]+)[^@\\-!:>]*" +
                ":(?<population>[0-9]+)[^@\\-!:>]*" +
                "!(?<typeAttack>[AD])![^@\\-!:>]*->(?<soldiersN>[0-9]+)[^@\\-!:>]*$";

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern2 = Pattern.compile(regex2);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;

        String text = "";
        String planetName = "";
        String typeAttack = "";

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){

                count ++;
             }
            for (int j = 0; j < input.length(); j++) {

                int ch = input.charAt(j);
                int asciiValue = ch - count;
                char convertedChar = (char) asciiValue;

                text += convertedChar;
            }
            Matcher matcher2 = pattern2.matcher(text);

            if (matcher2.find()){

                planetName = matcher2.group(1);
                typeAttack = matcher2.group(3);
            }
            if (typeAttack.equals("A")){
                attacked.add(planetName);
            }
            else if(typeAttack.equals("D")){
                destroyed.add(planetName);
            }
            text = "";
            count = 0;
        }
            System.out.printf("Attacked planets: %d\n", attacked.size());
                attacked.stream().sorted(String::compareTo).forEach(el -> System.out.println("-> " + el));

            System.out.printf("Destroyed planets: %d\n",  destroyed.size());
                destroyed.stream().sorted(String::compareTo).forEach(el -> System.out.println("-> " + el));
        }
    }


