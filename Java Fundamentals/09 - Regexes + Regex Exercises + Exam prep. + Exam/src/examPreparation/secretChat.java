package examPreparation;

import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")){

            String[] line = input.split(":\\|:");

            String command = line[0];

            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(line[1]);

                    sb.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder subStr = new StringBuilder(line[1]);
                    if (sb.toString().contains(subStr)){

                        int startIndex = sb.indexOf(String.valueOf(subStr.charAt(0)));
                        int endIndex = startIndex + subStr.length()-1;

                        sb.delete(startIndex, endIndex+1);
                        subStr.reverse();
                        sb.append(subStr);
                    }
                    else {
                        System.out.println("error");
                        input = scanner.nextLine();
                        continue;
                    }
                    break;
                case "ChangeAll":
                    String sbChars = line[1];
                    String newChars = line[2];
                    String sbNew = sb.toString().replaceAll(sbChars, newChars);
                    sb.setLength(0);
                    sb.append(sbNew);
                    break;
    }
            System.out.println(sb.toString());
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", sb.toString());
    }
}
//      https://youtu.be/0bczxFJeJe4
