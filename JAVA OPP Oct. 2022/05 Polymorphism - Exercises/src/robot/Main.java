package robot;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Position position = new Position(0, 0);

        StringBuilder sb = new StringBuilder();


            char[] line = input.toCharArray();

            for (int i = 0; i < line.length; i++) {
                char temp = line[i];

                switch (temp){
                    case 'N':
                        position.setX(+0);
                        position.setY(+1);
                        sb.append(position);

                        break;
                }
            }
        System.out.println();
    }
}
