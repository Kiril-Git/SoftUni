import entities.Employee;

import javax.persistence.EntityManager;

public class O4a_emplSalaryOver50k {
    public static void main(String[] args) {

        Utils.createEntityManager()
                .createQuery("FROM Employee WHERE salary > 50000", Employee.class)
                .getResultList()
                .forEach(employee -> System.out.println(employee.getFirstName()));

    }
}
