import java.lang.reflect.Array;
import java.util.Scanner;

public class removeReps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        line += "k";
       StringBuilder sb = new StringBuilder();

        for (int i = 0; i < line.length()-1; i++) {

            char temp1 = line.charAt(i);
            char temp2 = line.charAt(i+1);

            if (temp2 != temp1){
                sb.append(temp1);
            }
        }
        System.out.println(sb);
    }
}
