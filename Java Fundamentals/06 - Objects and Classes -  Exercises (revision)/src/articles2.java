
import java.util.Scanner;

public class articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");

        String title = line[0];
        String content = line[1];
        String author = line[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(": ");

            String command = input[0];
            String temp = input[1];

            switch (command){

                case "Edit":
                    article.setContent(temp);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(temp);
                    break;
                case "Rename":
                    article.setTitle(temp);
                    break;
            }
        }

        System.out.println(article.toString());
    }

    static class Article{

        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        @Override
        public String toString(){

            return  String.format("%s - %s: %s", this.title, this.content, this.author);
        }

    }
}
