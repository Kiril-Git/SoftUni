import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //  shortcut -> elements2.iter

        String[] Arr1 = new String[n];
        String[] Arr2 = new String[n];

        for (int i = 0; i < n; i++) {

            String[] elements = scanner.nextLine().split(" ");

            if (i % 2 == 0){
                Arr1[i] = elements[0];
                Arr2[i] = elements[1];
            }
            else {
                Arr1[i] = elements[1];
                Arr2[i] = elements[0];
            }
        }
        for (int i = 0; i < Arr1.length; i++) {
            System.out.print(Arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Arr2.length; i++) {
            System.out.print(Arr2[i] + " ");
        }
    }
}   //  j11zX0du





