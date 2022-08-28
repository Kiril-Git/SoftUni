import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        LocalDate birthdayVeronica = LocalDate.of(1980, 6, 8);
        LocalDate birthdayAtanas = LocalDate.of(1970, 2, 3);

        birthdayAtanas = birthdayVeronica.plusYears(36);

//        System.out.println(birthdayVeronica);
        System.out.println(birthdayAtanas);

    }
}
