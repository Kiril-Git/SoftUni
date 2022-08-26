import java.util.*;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	// write your code here

//                 Сортиране:                   TreeMap             азбучен ред или от по-малко към по-голямо
//                                              LinkedHashMap       по реда на добавяне
//                                              HashMap             от по-малко към по-голямо

        int minNum = Arrays.stream(new int[]{15, 25, 35}).min().getAsInt();
        int sum = Arrays.stream(new int[]{15, 25, 35}).sum();


        ArrayList<Integer> nums = new ArrayList<>() {{
            add(15); add(20); add(25);
        }};
        System.out.println(nums);

        int min = nums.stream()
                .mapToInt(Integer::intValue)
                .min().getAsInt();

        int max = nums.stream().mapToInt(Integer::intValue)
                .max().getAsInt();


         int min2 = nums.stream()
                 .min(Integer::compareTo).get();

        int doSum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double avg = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String[] words = {"abc", "def", "geh", "yyy"};

        words = Arrays.stream(words)
                .map(w -> w + "yyy")
                .toArray(String[]::new);


//        alt + enter
        System.out.println(minNum);
        System.out.println(sum);


//        (a -> a > 5)
//        Lambda operator ->
//        Read as "goes to"
//        The left side specifies the input parameters
        System.out.println("Enter the value below ↓");
        System.out.println(func(scanner.nextInt()));
    }
    //        x -> x / 2
static int func(int x)
{return x / 2;}
}


