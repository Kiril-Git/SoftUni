import java.util.Scanner;

public class ZigZagArrays5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {

            String num = scanner.nextLine();

            int num1 = Integer.parseInt(num.split(" ")[0]);
            int num2 = Integer.parseInt(num.split(" ")[1]);

            if (i % 2 == 0) {
                arr1[i] = num1;
                arr2[i] = num2;
            } else {
                arr1[i] = num2;
                arr2[i] = num1;
            }
        }
        for (int num : arr1) {
            System.out.println(num + " ");
        }
        for (int num : arr2) {
            System.out.println(num + " ");
        }

        /*for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }*/
    }
}   //  j11zX0du    comment : Ctrl + Shift + /





