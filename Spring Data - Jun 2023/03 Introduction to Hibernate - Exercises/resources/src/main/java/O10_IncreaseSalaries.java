import entities.Employee;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class O10_IncreaseSalaries {
    public static void main(String[] args) {

        final EntityManager entityManager = Utils.createEntityManager();

        entityManager.getTransaction().begin();

        final List<Employee> employees = entityManager
                .createQuery("FROM Employee WHERE department.id IN (1, 2, 4, 11)", Employee.class)
                .getResultList();

                employees.forEach(employee -> employee.setSalary(employee.getSalary()
                        .multiply(BigDecimal.valueOf(1.12))));

                entityManager.flush();
                entityManager.getTransaction().commit();
                entityManager.close();

        employees.forEach(employee -> employee.printIncreasedSalary());
    }
}

