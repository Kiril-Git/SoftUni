import entities.Employee;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class O4_emplSalaryOver50k {
    public static void main(String[] args) {

        final EntityManager entityManager = Utils.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager
                .createQuery("FROM Employee WHERE salary > 50000", Employee.class)
                .getResultList()
                .forEach(employee -> System.out.println(employee.getFirstName()));

        entityManager.getTransaction().commit();
    }
}
