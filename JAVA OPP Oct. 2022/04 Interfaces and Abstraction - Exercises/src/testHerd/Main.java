package testHerd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Goat> goats = new ArrayList<>();
//        List<Cow> cows = new ArrayList<>();

        List<Animal> animals = new ArrayList<>();   //  -  Adding an interface "Animal"
        List<Swimmer> swimmers = new ArrayList<>();

        Goat Ani = new Goat("Ani");
        Goat Lili = new Goat("Lili");

        animals.add(Ani);
        animals.add(Lili);
        swimmers.add(Ani);
        swimmers.add(Lili);

        Cow Mery = new Cow("Mery");
        Cow Gaby = new Cow("Gaby");
        animals.add(Mery);
        animals.add(Gaby);

//        for (Goat el : goats){
//            el.walk();
//        }
//
//        for (Cow el : cows){
//            el.walk();
//        }

        for (Animal el : animals){
            el.walk();
        }
        System.out.println();
        for (Swimmer el : swimmers){
            el.swim();
        }
    }
}
