import java.util.Scanner;

public class muOnline {                                //    return; - излизаме от метода
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] roomsN = scanner.nextLine().split("\\|");

        int sum = 100;
        int temp = 0;
        int bestRoom = 0;
        int bestRoomN = 0;
        int bitcoins = 0;

        for (int i = 0; i < roomsN.length; i++) {

            if (sum <= 0){
                break;
            }
            String[] room = roomsN[i].split(" ");

            String command = room[0];
            int num = Integer.parseInt(room[1]);

            switch (command){
                case "potion":
                    if(sum + num <= 100){
                        sum += num;
                        System.out.printf("You healed for %d hp.\n", num);
                        System.out.printf("Current health: %d hp.\n", sum);
                    }else {
                        temp = sum;
                        sum = 100;
                        System.out.printf("You healed for %d hp.\n", sum - temp);
                        System.out.printf("Current health: %d hp.\n", sum);
                    }
                    break;
                case "chest":
                    bitcoins += num;
                    System.out.printf("You found %d bitcoins.\n", num);
                    break;
                default:
                    if (num > bestRoom){
                        bestRoom = num;
                        bestRoomN = i+1;
                    }
                    if (sum - num > 0){
                        sum -= num;
                        System.out.printf("You slayed %s.\n", command);
                    }
                    else {
                        sum -= num;
                        System.out.printf("You died! Killed by %s.\n", command);
                        System.out.println("Best room: " + bestRoomN);
                    }
            }
        }
        if (sum > 0){
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + bitcoins);
            System.out.println("Health: " + sum);
        }
    }
}
