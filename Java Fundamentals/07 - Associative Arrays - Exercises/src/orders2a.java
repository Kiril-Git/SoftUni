
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, product> mapList = new LinkedHashMap<>();

        while (!input.equals("buy")){

            String[] line = input.split(" ");

            String productName = line[0];
            Double price = Double.valueOf(line[1]);
            Double quantity = Double.valueOf(line[2]);

            if (mapList.containsKey(productName)){

                mapList.get(productName).setPrice(price);
                mapList.get(productName).setQuantity(mapList.get(productName).getQuantity() + quantity);
            }
            else {
                mapList.put(productName, new product(productName, price, quantity));
            }
            input = scanner.nextLine();
        }
        mapList.forEach((k, v) -> System.out.printf("%s %s", k, v));
    }


    static class product {

        String productName;
        Double price;
        Double quantity;

        public product(String productName, Double price, Double quantity) {
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString(){

            return String.format("-> %.2f\n",  price * quantity);
        }
    }

}
