import entities.Employee;

import javax.persistence.EntityManager;

public class O12_DepMaxSalary {

    public static void main(String[] args) {
        final EntityManager entityManager = Utils.createEntityManager();

        entityManager
                .createQuery("SELECT department.name, MAX(salary) " +
                        " FROM Employee " +
                        " GROUP BY department.name " +

                        " HAVING MAX(salary) NOT BETWEEN 30000 AND 70000", Object[].class
                )
                .getResultList()
                .forEach(objects -> System.out.println(objects[0] + " " + objects[1]));
    }
}


/*
    SELECT d.name, MAX(salary) FROM employees
        JOIN departments d on d.department_id = employees.department_id
        WHERE salary > 70000 or salary < 30000
        GROUP BY employees.department_id;*/
