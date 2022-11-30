package telephon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> nums = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        List<String> urls = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(nums, urls);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());

    }
}
