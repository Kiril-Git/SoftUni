import java.util.Scanner;

public class testExerc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = "bigDonga";

        text = text.replace("big", "endowed" );



        System.out.println(text.substring(3));      // взема от индекс 3 до края

        System.out.println(text.indexOf("D"));

        System.out.println(text.contains("big"));

        System.out.println(text);

        StringBuilder sb = new StringBuilder();

//        -
        System.out.println("-");
        sb.append("Donga");
        sb.insert(0, "big");
        sb.insert(8, " - ");
        sb.append("\n");
        sb.append("Marvellous");

        System.out.println(sb);


    }
}
