import java.util.Arrays;
import java.util.Scanner;

public class multiplyBigNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] bigNum = scanner.nextLine().toCharArray();
       int multiplier = Integer.parseInt(scanner.nextLine());

       StringBuilder sb = new StringBuilder();
        int reminder = 0;

        for (int i = bigNum.length-1; i >= 0; i--) {

            int sum = 0;
            int temp = Integer.parseInt(String.valueOf(bigNum[i]));

            sum = temp * multiplier + reminder;

            reminder = sum / 10;

            if (i != 0){
                sum %= 10;
                sb.insert(0, sum);
            }
            else {
                sb.insert(0, sum);
            }
        }
        while (sb.charAt(0) == '0' & sb.length() > 1){      // Delete 000 from the first positions of the product / sum
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}
