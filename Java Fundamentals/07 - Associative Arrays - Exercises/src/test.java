import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("Kozhata", "0789456123");
        phoneBook.put("Donga", "0789456123");
        phoneBook.put("Buzema", "0789123456");

        phoneBook.put("Donga", "+359 789 456 123");

        String phoneNum = phoneBook.get("Donga");


        System.out.println(phoneNum);

        phoneBook.forEach((key, value) -> System.out.printf("%s - %s\n", key, value));

        System.out.println(phoneBook.containsValue("0789123456"));



    }
}
