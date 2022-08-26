package examPreparation;

import java.awt.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patt = Pattern.compile("^(?<peackName>[A-Za-z\\d!@#$?]+)" +
                "(?<delimiter>\\=)(?<codelenght>[0-9]+)(?<delimiter2>[<]{2})(?<code>[\\w]+)$");

        String input = scanner.nextLine();


        while (!input.equals("Last note")){

            Matcher matcher = patt.matcher(input);

            String name = "";
            int length = 0;
            String code = "";
            int codeLength = 0;

            String nameNew = "";

            if (matcher.find()) {

                 name = matcher.group(1);

                 length = Integer.parseInt(matcher.group(3));
                 code = matcher.group(5);
                 codeLength = code.length();

               if(codeLength == length){

                   String extract = name.replaceAll("[^a-zA-Z]+", "");


                   System.out.printf("Coordinates found! %s -> %s\n", extract, code);
                   input = scanner.nextLine();
                   continue;
               }
               }
            System.out.println("Nothing found!");

            input = scanner.nextLine();
        }

    }
}
