import java.util.Scanner;

public class explosions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        line += "k";
       StringBuilder sb = new StringBuilder();
       int dels = 0;

        for (int i = 0; i < line.length()-1; i++) {

            char temp1 = line.charAt(i);
            char temp2 = line.charAt(i+1);

            if (dels > 0 & temp1 != '>'){
                dels--;
            }
             else if (temp1 != '>'){
                sb.append(temp1);
            }
            else {
                sb.append(temp1);
                int n = Integer.parseInt(String.valueOf(temp2));
                dels += n - 1;
                i++;
            }
        }
        System.out.println(sb);
    }
}
//                      int temp = Integer.parseInt(String.valueOf(bigNum[i]));