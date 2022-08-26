import java.util.Scanner;

public class lettersNumsOperations2 {
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
                sum = num * getAlphabetPos(temp1);
            }
            else {
                sum = num * 1.0 / getAlphabetPos(temp1);
            }
            if (Character.isLowerCase(temp2)) {
                sum += getAlphabetPos(temp2);
            }
            else {
                sum -= getAlphabetPos(temp2);
            }
            total += sum;
            sum = 0;
        }
        System.out.printf("%.2f", total);
    }
     static int getAlphabetPos(char c){
         if(Character.isLowerCase(c)){
             return (int)c - (int)'a'+1;
         }
else{
             return (int)c-(int)'A' +1;
         }

     }
}
//                      int temp = Integer.parseInt(String.valueOf(bigNum[i]));