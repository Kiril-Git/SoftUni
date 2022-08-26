import java.util.Scanner;

public class testHashCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "AB";
        System.out.println(str.hashCode());

        str += "C";
        System.out.println(str.hashCode());

        String text = "I love fruits!";
        System.out.println(text.contains("fruits"));

        String card = "10C";
        String power = card.substring(0, 2);
        System.out.println(power);

        String text2 = "My name is John";
        String extractWord = text2.substring(11);
        System.out.println(extractWord);

        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana"));
        System.out.println(fruits.indexOf("orange"));
        System.out.println(fruits.lastIndexOf("banana"));
    }
}
