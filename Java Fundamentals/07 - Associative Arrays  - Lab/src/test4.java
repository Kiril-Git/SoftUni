import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> phoneBook = new HashMap<>();   //  Ползваме HashMap, когато не се изисква подредба, защото е по-бърз

        Person Donga = new Person("Donga", 2324, "donga@abv.bg");
        Person Buzema = new Person("Buzema", 2323, "buzema@abv.bg");
        Person Dany = new Person("Dany", 1717, "dany@abv.bg");

        phoneBook.put(Donga.getName(), Donga.phoneNumber);
        phoneBook.put(Dany.getName(), Dany.phoneNumber);
        phoneBook.put(Buzema.getName(), Buzema.phoneNumber);

        //              key & value
        phoneBook.forEach((key, value) -> System.out.printf("fella: %s . . . num: %d\n", key, value));

    }
    static class Person{
        String name;
        int phoneNumber;
        String email;

        public Person(String name, int phoneNumber, String email){
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }



        public String getName(){
            return name;
        }
        public int getPhoneNumber(){
            return phoneNumber;
        }
        public String getEmail(){
            return email;
        }
    }
}
