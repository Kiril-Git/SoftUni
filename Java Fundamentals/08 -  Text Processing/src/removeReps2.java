import java.util.Scanner;

public class removeReps2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       StringBuilder sb = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < sb.length()-1; i++) {

            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(i+1);

            if (temp2 == temp1){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
