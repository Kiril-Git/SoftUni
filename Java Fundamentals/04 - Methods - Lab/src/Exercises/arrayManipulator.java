package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayManipulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String[] line = input.split(" ");

            String command = line[0];

            switch (command){
                case "exchange":
                    int index = Integer.parseInt(line[1]);

                    indexValidation(index, arr.length);

                    if (!indexValidation(index, arr.length)){
                        System.out.println("Invalid index");
                    }
                    else {
                        int[] exchangedArray = exchangeSubArrays(arr, index);
                        arr = exchangedArray;
                    }
                    break;
                case "max":
                    if (line[1].equals("odd")) {
                        printIndOfOddMax(arr);
                    }
                    else if (line[1].equals("even")) {
                        printIndOfEvenMax(arr);
                    }
                    break;
                case "min":
                    if (line[1].equals("odd")) {
                        printIndOfOddMin(arr);
                    }
                    else if (line[1].equals("even")) {
                        printIndOfEvenMin(arr);
                    }
                    break;
                case "first":
                    int n = Integer.parseInt(line[1]);
                    if (!indexValidation(n-1, arr.length)){
                        System.out.println("Invalid count");
                    }
                    else if (line[2].equals("odd")){
                        printFirstOdds(arr, n);
                    }
                    else if (line[2].equals("even")) {
                        printFirstEvens(arr, n);
                    }
                    break;
                case "last":

                    int num = Integer.parseInt(line[1]);
                    if (!indexValidation(num-1, arr.length)){
                        System.out.println("Invalid count");
                    }
                    else if (line[2].equals("odd")){
                        printLastOdds(arr, num);
                    }
                    else if (line[2].equals("even")) {
                        printLastEvens(arr, num);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void printLastEvens(int[] arr, int num) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] % 2 == 0){

//                result.add(arr[i] );
                result.add(0, arr[i]);
            }
            if (result.size() == num){

                break;
            }
        }
        System.out.println(result);
    }

    private static void printLastOdds(int[] arr, int num) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] % 2 != 0){

                result.add(0, arr[i]);
            }
            if (result.size() == num){

                break;
            }
        }
        System.out.println(result);
    }

    private static void printFirstEvens(int[] arr, int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){

                result.add(arr[i] );
            }
            if (result.size() == n){

                break;
            }
        }
        System.out.println(result);
    }

    private static void printFirstOdds(int[] arr, int n) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){

                result.add(arr[i] );
            }
            if (result.size() == n){

                break;
            }
        }
        System.out.println(result);
    }

    private static boolean indexValidation(int index, int length) {

        return index >= 0 & index < length;
    }

    private static void printIndOfEvenMin(int[] arr) {
        int min = 1001;
        int index = 0;
        String nailIt = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= min & arr[i] % 2 == 0 ){
                min = arr[i];
                index = i;
                nailIt += "Yes!";
            }
        }
        if (nailIt == ""){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static void printIndOfOddMin(int[] arr) {
        int min = 1001;
        int index = 0;
        String nailIt = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= min & arr[i] % 2 != 0 ){
                min = arr[i];
                index = i;
                nailIt += "Yes!";
            }
        }
        if (nailIt == ""){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static void printIndOfEvenMax(int[] arr) {
        int max = -1;
        int index = 0;
        String nailIt = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= max & arr[i] % 2 == 0 ){
                max = arr[i];
                index = i;
                nailIt += "Yes!";
            }
        }
        if (nailIt == ""){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static void printIndOfOddMax(int[] arr) {

        int max = -1;
        int index = 0;
        String nailIt = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= max & arr[i] % 2 != 0 ){
                max = arr[i];
                index = i;
                nailIt += "Yes!";
            }
        }
        if (nailIt == ""){
            System.out.println("No matches");
        }
        else {
            System.out.println(index);
        }
    }

    private static int[] exchangeSubArrays(int[] arr, int index) {

        int[] a = Arrays.copyOfRange(arr, 0, index+1);
        int[] b = Arrays.copyOfRange(arr, index+1, arr.length);

        int[] result = new int[a.length + b.length];

        System.arraycopy(b, 0, result, 0, b.length);
        System.arraycopy(a, 0, result, b.length, a.length);

        return result;
    }
}
