import java.util.Scanner;

public class ZigZagArrays3 {
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
        System.out.println(String.join(" ", Arr1));
        System.out.println(String.join(" ", Arr2));

    }
}   //  j11zX0du





