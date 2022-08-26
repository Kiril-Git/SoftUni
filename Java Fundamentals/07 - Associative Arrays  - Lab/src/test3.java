import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> phoneBook = new HashMap<>();   //  Ползваме HashMap, когато не се изисква подредба, защото е по-бърз

        phoneBook.put("Donga", 2323);
        phoneBook.put("Donga", 2324);   //  overriding
        phoneBook.put("Buzema", 2323);

        phoneBook.put("Dany", 1717);

        int phoneNum = phoneBook.get("Donga");

        System.out.println(phoneNum);

        //              key & value
        phoneBook.forEach((key, value) -> System.out.printf("fella: %s . . . num: %d\n", key, value));

    }
}
