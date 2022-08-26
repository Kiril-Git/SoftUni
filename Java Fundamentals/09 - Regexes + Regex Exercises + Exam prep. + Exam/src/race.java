import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] racersList = scanner.nextLine().split(", ");

        String results = scanner.nextLine();

        String nameRegex = "[A-Za-z]+";
        String distanceRegex = "\\d{1}";

        Pattern namepatt = Pattern.compile(nameRegex);
        Pattern distancePatt = Pattern.compile(distanceRegex);

        String name = "";
        int distance = 0;

        Map<String, Integer> racers = new HashMap<>();
        Map<String, Integer> racers2 = new LinkedHashMap<>();


        for (String el : racersList){

            racers.put(el, 0);
        }
        while (!results.equals("end of race" )){

            Matcher nameMatch = namepatt.matcher(results);
            Matcher distanceMatch = distancePatt.matcher(results);

           while (nameMatch.find() ) {

                name += nameMatch.group();
            }
            while (distanceMatch.find()) {

                distance += Integer.parseInt(distanceMatch.group());
            }
            if (racers.containsKey(name)){
                racers.put(name, racers.get(name)+distance);
            }
             name = "";
             distance = 0;

            results = scanner.nextLine();
        }
//        racers.forEach((k,v) -> System.out.println(k + " " + v));
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(racers.entrySet());
//        list.sort(Map.Entry.comparingByValue());

        racers.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> racers2.put(x.getKey(), x.getValue()));

        Object first = racers2.keySet().toArray()[0];
        Object second = racers2.keySet().toArray()[1];
        Object third = racers2.keySet().toArray()[2];

        System.out.printf("1st place: %s\n", first);
        System.out.printf("2nd place: %s\n", second);
        System.out.printf("3rd place: %s\n",third);
    }
}
