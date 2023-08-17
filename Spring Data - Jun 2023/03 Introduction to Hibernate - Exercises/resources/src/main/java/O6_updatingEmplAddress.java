import entities.Address;
import entities.Employee;

import javax.persistence.EntityManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;

public class O6_updatingEmplAddress {
    public static void main(String[] args){

        final EntityManager entityManager = Utils.createEntityManager();
        final Scanner scanner = new Scanner(System.in);
        entityManager.getTransaction().begin();

        final String lastName = scanner.nextLine();


        final Set<Employee> employees = Set.copyOf(entityManager
                .createQuery("FROM Employee WHERE lastName = :lastName", Employee.class)
                .setParameter("lastName", lastName)
                .getResultList());

        Address newAddress = new Address();
        newAddress.setText("Vitoshka 15");

        entityManager.persist(newAddress);

        employees.forEach(employee -> employee.setAddress(newAddress));

        entityManager.flush();
        entityManager.getTransaction().commit();
        entityManager.close();
        scanner.close();
    }
}
/*
if (newAddressId != -1) {
        String updateEmployeeQuery = "UPDATE employees SET address_id = ? WHERE last_name = ?";
        PreparedStatement updateEmployeeStmt = connection.prepareStatement(updateEmployeeQuery);
        updateEmployeeStmt.setInt(1, newAddressId);
        updateEmployeeStmt.setString(2, lastNameToUpdate);

        int employeesUpdated = updateEmployeeStmt.executeUpdate();
        if (employeesUpdated > 0) {
        System.out.println("Employee address updated successfully.");
        } else {
        System.out.println("No employees were updated.");
        }
*/

/*    UPDATE employees
    SET address_id = 292 WHERE last_name = 'Ford';*/


