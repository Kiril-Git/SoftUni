import java.util.*;

public class Synonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> mapSyns = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String syn = scanner.nextLine();

            if (!mapSyns.containsKey(word)){
                mapSyns.put(word, new ArrayList<>());
                mapSyns.get(word).add(syn);
            }
            else {
                mapSyns.get(word).add(syn);
            }
        }
        for (Map.Entry<String, ArrayList<String>> entry : mapSyns.entrySet()) {
            System.out.printf("%s - %s\n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
