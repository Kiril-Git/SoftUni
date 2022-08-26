package examPreparation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class emojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patt = Pattern.compile("(?<delimiter>[\\:\\:||**]{2})(?<emojis>[A-Z][a-z]{2,})\\1");

        

    }
}
