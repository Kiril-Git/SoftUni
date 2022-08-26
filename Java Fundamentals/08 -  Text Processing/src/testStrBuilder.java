import java.util.Date;
import java.util.Scanner;

public class testStrBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder();

        sb.append("Hello, ");
        sb.append("John! ");
        sb.append("I've sent you an email.");

        sb.replace(7, 11, "Donga");

        sb.insert(7, "big ");

        System.out.println(sb);
        System.out.println();

//        -
        System.out.println(new Date());

        String text = "";
        StringBuilder text2 = new StringBuilder();

        for (int i = 0; i < 1000000; i++) {
//            text += "a";
            text2.append("a");

        }
        System.out.println(new Date());
        text2.setLength(0);
        System.out.println(text2.length());

    }
}
