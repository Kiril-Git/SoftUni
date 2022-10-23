import java.util.*;

public class lootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueBox = new ArrayDeque<>();
        ArrayDeque<Integer> stackBox = new ArrayDeque<>();
        int loot = 0;

        String input = scanner.nextLine();

        Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(queueBox::offer);

        input = scanner.nextLine();

        Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(stackBox::push);

        while (!queueBox.isEmpty() & !stackBox.isEmpty()){

            int el1 = queueBox.peek();
            int el2 = stackBox.peek();

            int sum = el1 + el2;

             if (sum % 2 == 0){

                 queueBox.poll();
                 stackBox.pop();
                 loot += sum;
             }
             else {
                 stackBox.pop();
                 queueBox.offer(el2);
             }
        }
        if (queueBox.isEmpty()){
            System.out.println("First lootbox is empty");
        }
        else {
            System.out.println("Second lootbox is empty");

        }
        if (loot >= 100) {
            System.out.println("Your loot was epic! Value: " + loot);
        }
        else {
            System.out.println("Your loot was poor... Value: " + loot);

        }
    }
}
