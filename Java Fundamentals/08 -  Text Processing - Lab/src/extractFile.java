import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String fileName = input.substring(input.lastIndexOf("\\")+1, input.indexOf("."));

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + input.substring(input.lastIndexOf(".")+1));
    }
}
