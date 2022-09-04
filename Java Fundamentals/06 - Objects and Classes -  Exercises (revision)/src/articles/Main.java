package articles;
//                              youtu.be/bYh6efSWj7w
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");

        int n = Integer.parseInt(scanner.nextLine());

        String title = line[0];
        String content = line[1];
        String author = line[2];

        Article article = new Article(title, content, author);

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");

            String command = input[0];
            String temp = input[1];

            switch (command){

                case "Edit":

                    article.edit(temp);
                    break;
                case "ChangeAuthor":

                    article.changeAuthor(temp);
                    break;
                case "Rename":

                    article.rename(temp);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
