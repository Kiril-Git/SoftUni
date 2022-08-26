package examPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, City> cityList = new HashMap<>();

        String name = "";
        int population = 0;
        int gold = 0;

        while (!input.equals("Sail")){

            String[] line = input.split("\\|\\|");

            name = line[0];
            population = Integer.parseInt(line[1]);
            gold = Integer.parseInt(line[2]);

            if (cityList.containsKey(name)){

                City city = cityList.get(name);
                city.setGold(city.getGold() + gold);
                city.setPopulation(city.getPopulation() + population);
            }
            else {
                City city = new City(name, population, gold);
                cityList.put(name, city);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] line = input.split("=>");

            String event = line[0];
            name = line[1];

            City city = cityList.get(name);

            switch (event){

                case "Plunder":

                    population = Integer.parseInt(line[2]);
                    gold = Integer.parseInt(line[3]);

                    city.setGold(city.getGold() - gold);
                    city.setPopulation(city.getPopulation() - population);

                    System.out.printf("%s plundered! %d gold stolen, " +
                            "%d citizens killed.\n", name, gold, population);
                    if (city.getGold() < 1 & city.getPopulation() < 1){

                        System.out.printf("%s has been wiped off the map!\n", name);
                        cityList.remove(city.getName());
                    }
                    break;
                case "Prosper":

                    gold = Integer.parseInt(line[2]);
                    if (gold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                        input = scanner.nextLine();
                        continue;
                    }
                    city.setGold(city.getGold() + gold);
                    System.out.printf("%d gold added to the city treasury. " +
                                "%s now has %d gold.\n", gold, name, city.getGold());
                    break;
            }
            input = scanner.nextLine();
        }
        if (cityList.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
        else {
            System.out.printf("Ahoy, Captain! " +
                    "There are %d wealthy settlements to go to:\n", cityList.size());
            cityList.values().forEach(System.out::println);
        }
    }
    static class City{

        String name;
        int population = 0;
        int gold = 0;

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
        @Override
        public String toString(){
            return String.format("%s -> " +
                    "Population: %d citizens, Gold: %d kg\n", name, population, gold);
        }
    }
}
//          watch?v=3VTWzepe9Bw
