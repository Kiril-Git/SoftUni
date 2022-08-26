import java.util.Arrays;
import java.util.Scanner;
public class airLineCableCar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queue = Integer.parseInt(scanner.nextLine());

        int[] cabsArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int diff = 0;
        int capacity = cabsArr.length * 4;

        for (int i = 0; i < cabsArr.length; i++) {

            if (cabsArr[i] == 4) {
                continue;
            }
            else if (queue + cabsArr[i] <= 4) {
                diff = queue;
                cabsArr[i] += diff;
                queue -= diff;
                capacity -= cabsArr[i];
                break;
            } else {
                diff = 4 - cabsArr[i];

                cabsArr[i] += diff;
                queue -= diff;
                capacity -= cabsArr[i];
            }
        }
        if (queue == 0 & capacity > 0){
            System.out.println("The lift has empty spots!");
        }
        else if (queue > 0 & capacity == 0){
            System.out.printf("There isn't enough space! %s people in a queue!\n", queue);
        }
        Arrays.stream(cabsArr).forEach(e -> System.out.print(e + " "));
    }
}

//      for (int j : cabsArr) {
//              System.out.print(j + " ");
//              }

//    int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();


//        double[] fltsArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                        .mapToDouble(Double::parseDouble)
//                .toArray();