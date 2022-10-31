package trafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int iter = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = Arrays.stream(input)
                .map(Color::valueOf)
                .map(TrafficLight::new)
                .collect(Collectors.toList());

        for (int i = 0; i < iter; i++) {
            for (TrafficLight el : trafficLights){
                el.changeColor();
                System.out.print(el.getColor() + " ");
            }
            System.out.println();
        }
    }
}
