public class Main {

    public static void main(String[] args) {

	// Poly Morphy = Много Форми

//        Полиморфизмът е възможността на една инстанция да придобива различни форми:

//        Car myCar;
//        myCar = new Seat();
//        myCar = new Bmw();
//        myCar = new Mercedes();

//        Всичко, което имаме дефинирано в кола го имаме и в сеата и бмв-то и в мерцедеса.

        int a = 2;
        int b = 4;
        double c = 5;

        System.out.println(sum(a, b));

        System.out.println(sum(a, c));

       Main.sum(b, c);

//       Overload  Compile time polymorphism
//        В Java два метода са еднакви, когато имат еднаква сигнатура,
//        сигнатурата е името на метода заедно с аргументите:    sum(int a, int b)

//        Методи с еднакви имена и с различия в сигнатурите са overloaded methods

//        Override е нещо, което наследяваме
    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(int a, double b){
        return a + b;
    }
}
