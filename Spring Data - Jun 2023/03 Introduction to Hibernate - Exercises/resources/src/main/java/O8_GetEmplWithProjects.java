import entities.Employee;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class O8_GetEmplWithProjects {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final EntityManager entityManager = Utils.createEntityManager();

        int employeeID = scanner.nextInt();

        entityManager.createQuery("FROM Employee WHERE id = :employee_id", Employee.class)
                .setParameter("employee_id", employeeID)
                .getSingleResult()
                .printEmplWithProjects();
    }

}


