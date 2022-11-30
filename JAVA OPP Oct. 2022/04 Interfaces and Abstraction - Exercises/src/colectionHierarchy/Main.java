package colectionHierarchy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        performAddOps(input, addCollection);
        performAddOps(input, addRemoveCollection);
        performAddOps(input, myList);

        performRemoveOps(n, addRemoveCollection);
        performRemoveOps(n, myList);
    }


    public static void performRemoveOps(int n, AddRemovable addRemovable){

        for (int i = 0; i < n; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }

    public static void performAddOps(String[] input, Addable addable){

        for (String el : input){
            System.out.print(addable.add(el) + " ");
        }
        System.out.println();
    }
}
