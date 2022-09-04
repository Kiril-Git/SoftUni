package articles;

public class Article {

    String title;
    String content;
    String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public void edit(String temp) {
        this.content = temp;
    }

    public void changeAuthor(String temp) {
        this.author = temp;
    }

    public void rename(String temp) {
        this.title = temp;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
