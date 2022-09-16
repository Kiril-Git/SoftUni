import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {13, 42, 69, 73, 69};

//        N = arr.length

        int num = 69;

        boolean containsNum = false;

        for (int temp : arr) {

            if (temp == num) {

                containsNum = true;
                break;
            }

        }
        System.out.println(containsNum);

        int memory = arr.length * Integer.BYTES;
        System.out.println(memory);
    }
}
