import entities.Employee;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class O11_SearchNameByPattern {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final EntityManager entityManager = Utils.createEntityManager();

        String pattern = scanner.nextLine();

        entityManager.createQuery("FROM Employee WHERE firstName LIKE CONCAT(:pattern, '%') ", Employee.class)
                .setParameter("pattern", pattern )
                .getResultList()
                .forEach(Employee::printNameByPattern);
    }
}

