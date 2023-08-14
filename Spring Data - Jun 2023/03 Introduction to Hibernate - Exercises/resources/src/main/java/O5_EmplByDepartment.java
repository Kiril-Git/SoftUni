import entities.Employee;

public class O5_EmplByDepartment {

    public static void main(String[] args) {

        Utils.createEntityManager()
                .createQuery("FROM Employee WHERE department.name = :dName " +
                        "ORDER BY salary ASC, id ASC", Employee.class)
                .setParameter("dName", "Research and Development")
                .getResultList()
                .forEach(employee -> System.out.println(
                         employee.getFirstName() + employee.getLastName()
                        + " from " + employee.getDepartment().getName() + " - " + employee.getSalary() ));

    }
}

/*    SELECT first_name, last_name, d.name FROM employees
        JOIN departments d on d.department_id = employees.department_id
        having d.name = 'Research and Development'
        ORDER BY salary ASC, employee_id ASC
        ;       */
