import java.util.Scanner;
public class ZigZagArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String Arr1 = "";
        String Arr2 = "";

        for (int i = 0; i < n; i++) {

            String elements = scanner.nextLine();
            String[] bits = elements.split(" ");

            if (i % 2 == 0) {
                for (int j = 0; j < bits.length; j++) {

                    Arr1 += bits[0] + " ";
                    Arr2 += bits[1] + " ";
                    break;
                }
            }
            else {
                for (int j = 0; j < bits.length; j++) {

                Arr1 += bits[1] + " ";
                Arr2 += bits[0] + " ";
                break;
            }
        }
    }
        System.out.println(Arr1);
        System.out.println(Arr2);
    }
}   //  j11zX0du
    //  s4fKd4cx





