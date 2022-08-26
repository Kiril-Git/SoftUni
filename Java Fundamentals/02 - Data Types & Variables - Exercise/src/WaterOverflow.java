import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shotsN = Integer.parseInt(scanner.nextLine());

        int vol = 0;

        for (int i = 1; i <= shotsN ; i++) {

            int shotL = Integer.parseInt(scanner.nextLine());

            if (vol + shotL <= 255) {
                vol += shotL;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(vol);

    }
}
