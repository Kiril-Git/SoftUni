import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	// Arrays

        String [] names = {"Ivo", "Donga", "kozhata"};
        String[] fellas = new String[3];

        //  Lists 1

        List<String> nameList = new ArrayList<>();

        nameList.add("Buzema");
        nameList.add("Donga");
        nameList.add("kozhata");

        //  Lists 2

        List<String> fellasList = new ArrayList(Arrays.asList("Donga", "Ivo", "Donga", "kozhata"));

        fellasList.remove("Donga");

        fellasList.set(0, "Lumbev");



        System.out.println();


    }
}
