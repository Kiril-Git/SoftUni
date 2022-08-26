import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        int rot = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rot; i++) {

            String firstE = elements[0];

            for (int j = 0; j < elements.length-1; j++) {

                elements[j] = elements[j+1];
            }
            elements[elements.length-1] = firstE;
        }
        System.out.println(String.join(" ", elements));
    }
}





