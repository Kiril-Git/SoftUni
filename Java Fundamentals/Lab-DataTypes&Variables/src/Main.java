public class Main {

    public static void main(String[] args) {

        int x = 0;

        int y = 2;

        do{

            x++;

            y = x;

        } while (y > 1 && x < 5);

        System.out.println(y);

    }
}
