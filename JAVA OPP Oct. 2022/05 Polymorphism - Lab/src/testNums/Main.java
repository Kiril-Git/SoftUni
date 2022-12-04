package testNums;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> myNums = new HashSet<>();

        myNums.add(1);
        myNums.add(15);
        myNums.add(2);
        myNums.add(24);
        myNums.add(-5);

        myNums = new TreeSet<>(myNums);
        myNums.forEach(System.out::println);

    }
}
