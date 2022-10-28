package rectangleDot;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates  = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());
//                                      "{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}".
        int bottomX = coordinates[0];
        int bottomY = coordinates[1];

        int topX = coordinates[2];
        int topY = coordinates[3];


        Point bottomL = new Point(bottomX, bottomY);
        Point topR = new Point(topX, topY);

        Rectangle rectangle = new Rectangle(bottomL, topR);

        for (int i = 0; i < n; i++) {

            int [] dotArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int x = dotArr[0];
            int y = dotArr[1];

            Point doth = new Point(x, y);

            System.out.println(rectangle.contains(doth));
        }
    }
}
