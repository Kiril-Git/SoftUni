import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here

        int[] collection = {1,2,3,4,10};

       for (int number : collection){

           System.out.println(number);
       }
        System.out.println();

        for (int i = 0; i < collection.length; i++) {

            System.out.print(collection[i] + " ");

        }
    }
}