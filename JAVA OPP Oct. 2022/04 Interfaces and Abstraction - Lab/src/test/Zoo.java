package test;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Lion lion = new Lion();
        Goat goat = new Goat();
        Koala koala = new Koala();

        lion.getFood();
        goat.getFood();
        koala.getFood();

        for (Animal el : animals){
            System.out.println(el.getFood());
        }
        for (Animal el : animals){
            el.speak();
        }
    }
}
