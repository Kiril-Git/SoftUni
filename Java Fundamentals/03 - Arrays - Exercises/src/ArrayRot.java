import java.util.Scanner;

public class ArrayRot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        //  shortcut -> elements2.iter

        for (int i = 0; i < n; i++) {

            String el1 = elements[0];

            for (int j = 0; j < elements.length-1; j++) {

                elements[j] = elements[j + 1];
            }
            elements[elements.length-1] = el1;
        }
        System.out.println(String.join(" " , elements));
    }
}





