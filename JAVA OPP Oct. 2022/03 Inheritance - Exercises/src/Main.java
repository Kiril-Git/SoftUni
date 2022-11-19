import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	// write your code here



        Lion lion = new Lion();
        lion.setName("Elza");



        System.out.println(lion.getName());

        lion.roar();

        System.out.println(lion.toString());
    }
}
