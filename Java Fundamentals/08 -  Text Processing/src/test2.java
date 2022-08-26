public class test2 {
    public static void main(String[] args) {


        String text = "Hello, john@softuni.bg, you have been using your email in your registration";
        String[] words = text.split("[, .]");

        for(String el : words) {
            System.out.print(el);
        }
    }
}
