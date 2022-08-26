import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        String[]  userInputArray = userInput.split(" ");

        int[] numsArray = new int[userInputArray.length];

        for (int i = 0; i < userInputArray.length; i++) {
            numsArray[i] = Integer.parseInt(userInputArray[i]);

        }
        System.out.println();
    }
}
