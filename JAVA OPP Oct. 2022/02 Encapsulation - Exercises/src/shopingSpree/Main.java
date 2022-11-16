package shopingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] people = scanner.nextLine().split(";");

        Map<String, Person> peopleMap = new LinkedHashMap<>();

        for (String el : people) {

            String[] personData = el.split("=");
            String name = personData[0];
            double cash = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, cash);

                peopleMap.put(name, person);                  //         ! ! ! ! ! ! ! ! ! ! ! ! ! !
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
        String[] products = scanner.nextLine().split(";");

        Map<String, Product> productMap = new LinkedHashMap<>();

        for (String el : products){

            String[] productData = el.split("=");
            String name = productData[0];
            double price = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, price);
                productMap.put(name, product);
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
                return;
            }
        }
        String input = scanner.nextLine();
        while (!"END".equals(input)){

            String[] line = input.split(" ");
            String name = line[0];
            String product = line[1];

            Person customer = peopleMap.get(name);
            Product item = productMap.get(product);

            try {
                customer.buyProduct(item);
                System.out.printf("%s bought %s\n", name, product);
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            input = scanner.nextLine();
        }
        peopleMap.values().forEach(System.out::println);
    }
}
