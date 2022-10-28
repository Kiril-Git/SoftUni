package bakery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bakery {

    private String name;
    private int capacity;
    private List<Employee> employees;

    public Bakery(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        employees = new ArrayList<>();
    }
    public void add(Employee employee){
        if (employees.size() < capacity){
            employees.add(employee);
        }
    }
    public boolean remove(String name){
        Employee toRemove = employees
                .stream()
                .filter(employee -> employee.getName().equals(name))
                .findFirst()
                .orElse(null);

        if (toRemove != null){
            employees.remove(toRemove);
            return true;
        }
        return false;
    }
    public Employee getOldestEmployee(){
        return employees.stream().max((f, s) -> f.getAge() - s.getAge())
                .orElse(null);
    }
    public Employee getEmployee(String name){
        return employees
                .stream()
                .filter(employee -> employee.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    public int getCount(){
        return employees.size();
    }
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Employees working at Bakery %s:\n", name));

        for (Employee el : employees){

            sb.append(el).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
