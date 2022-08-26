import java.util.Scanner;

public class characterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int sum = 0;
        char[] str1 = input[0].toCharArray();
        char[] str2 = input[1].toCharArray();

        int shorty = Math.min(str1.length, str2.length);
        int longy = Math.max(str1.length, str2.length);

        for (int i = 0; i < longy; i++) {

           if (i < shorty){

               sum += str1[i] * str2[i];
           }
           else if (str1.length > str2.length){
               sum += str1[i];
           }
           else {
               sum += str2[i];
           }
        }
        System.out.println(sum);
    }
}
