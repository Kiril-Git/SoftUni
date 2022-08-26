package lab;

//private static String getMax(String str1, String str2) {
//        String result = "";
//
//        if (str1.compareTo(str2) > 0) {
//        result = str1;
//        }
//        else {
//        result = str2;
//        }
//        return result;

import java.util.Scanner;

public class greaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                int largerOne = getMax(num1, num2);
                System.out.println(largerOne);
                break;
            case "char":
                char char1 = scanner.nextLine().charAt(0);
                char char2 = scanner.nextLine().charAt(0);
                char largerChar = getMax(char1, char2);
                System.out.println(largerChar);
                break;
            case "string":
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                String largerStr = getMax(str1, str2);
                System.out.println(largerStr);
                break;
        }
    }

    private static int getMax(int num1, int num2) {

        if(num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }
    private static char getMax(char char1, char char2){
        if (char1 > char2){
            return char1;
        }
        else {
            return char2;
        }
    }
    private static String getMax(String str1, String str2) {

        String result = "";

        if (str1.compareTo(str2) > 0) {
            result = str1;
        }
        else {
            result = str2;
        }
        return result;
    }
}
