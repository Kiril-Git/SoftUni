package companyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] line = scanner.nextLine().split(" ");

            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];
            String email = "n/a";
            int age = -1;

            Employee employee = new Employee(name, salary, position, department, email, age);


                    if (line.length == 6){

                        email = line[4];
                        age = Integer.parseInt(line[5]);

                        list.add(employee);
                    }
                    else if (line.length == 5) {

                        if (line[4].contains("@")){
                        email = line[4];
                        list.add(employee);
                    }
                    else {
                        age = Integer.parseInt(line[4]);
                        list.add(employee);
                    }
            }
        }
    }
}
