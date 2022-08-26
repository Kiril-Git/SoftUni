import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        String title = "";

        if (age >= 0 & age <= 2){
            title = "baby";
        }
        else if (age > 2 & age < 14){
            title = "child";
        }
        else if (age > 13 & age < 20){
            title = "teenager";
        }
        else if (age > 19 & age < 66){
            title = "adult";
        }
        else if (age > 65){
            title = "elder";
        }
        else {
            System.out.println();
        }

        System.out.println(title);

    }
}
