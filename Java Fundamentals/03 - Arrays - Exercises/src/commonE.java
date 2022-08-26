import java.util.Scanner;

public class commonE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] elements2 = scanner.nextLine().split(" ");

        //  shortcut -> elements2.iter

        for (String secondE : elements2) {

            for (String firstE : elements) {
                if (secondE.equals(firstE)){

                    System.out.print(firstE + " " );
        }
            }
        }
    }
}





