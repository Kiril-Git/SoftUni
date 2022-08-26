import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "Hello" + ", " + "darling!";

        String text2 = "Hello, ";
        text2 += "John";

        String greet = "Hello, ";
        String name = "sweetheart";
        String text3 = greet.concat(name) ;

        System.out.println(text);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println();

        System.out.println("Address someone bellow ⬇");
        String address = scanner.nextLine();
        String text4 = greet + address;

        System.out.println(text4);
    }
}
