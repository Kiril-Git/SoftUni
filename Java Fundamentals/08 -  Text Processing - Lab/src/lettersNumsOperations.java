import java.util.Scanner;

public class lettersNumsOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line[] = scanner.nextLine().split(" ");

       double total = 0;
       double sum = 0;

        for (int i = 0; i < line.length; i++) {

            String temp = line[i];
            String nums = "";

            char temp1 = temp.charAt(0);
            char temp2 = temp.charAt(temp.length()-1);
            int temp1int = 0;
            int temp2int = 0;

            for (int j = 1; j < temp.length()-1; j++) {

                nums += temp.charAt(j);
            }
            int num = Integer.parseInt(nums);

            if (Character.isLowerCase(temp1)) {
                temp1int = (int)temp1 - (int)'a' + 1;
                sum = num * temp1int;
            }
            else {
                temp1int = (int)temp1 - (int)'A'+1;
                sum = num * 1.0 / temp1int;
            }
            if (Character.isLowerCase(temp2)) {
                temp2int = (int)temp2 - (int)'a' + 1;
                sum += temp2int;
            }
            else {
                temp2int = (int)temp2 - (int)'A' + 1;
                sum -= temp2int;
            }
            total += sum;
            sum = 0;
        }
        System.out.printf("%.2f", total);
    }

}
//                      int temp = Integer.parseInt(String.valueOf(bigNum[i]));