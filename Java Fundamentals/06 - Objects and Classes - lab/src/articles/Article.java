package articles;

import java.util.Scanner;

public class Article {

//    Характеристики -> полета
    private String title;
    private String content;
    private String author;

//    Конструктор -> създаваме обекти - public
    public Article (String title, String content, String author){

//        нов обект
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void edit (String newContent){
        this.content = newContent;
    }
    public  void  changeAuthor (String newAuthor){
        this.author = newAuthor;
    }
    public void rename (String newTitle){
        this.title = newTitle;
    }
    @Override
    public String toString(){
        return this.title + " - " + this.content + ": " + this.author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
