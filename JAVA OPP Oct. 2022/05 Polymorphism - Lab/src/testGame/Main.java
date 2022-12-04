package testGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Вляво имаме по-абстрактен тип а вдясно по-конкретен тип
                    Person petko        =      new Friend();
//                 reference type               object type

        Person specov = new Enemy();


        petko = new Enemy();
        specov = new Friend();

    }
}
