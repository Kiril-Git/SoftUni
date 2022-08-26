import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                        .mapToInt(e -> Integer.parseInt(e))
                                .toArray();

            System.out.println();

    }
}


//  numbers: 10 15 20 25 30

//  Mitko Pepi Ivo Didi
