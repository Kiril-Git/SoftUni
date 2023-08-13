import entities.Employee;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class O3_ContainsEmployee {
    public static void main(String[] args) {

        final EntityManager entityManager = Utils.createEntityManager();
        final Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();

        entityManager.getTransaction().begin();

        try {
            entityManager.
                    createQuery("FROM Employee WHERE CONCAT_WS(' ', firstName, lastName) = :fullName", Employee.class).
                    setParameter("fullName", fullName).getSingleResult();

            entityManager.getTransaction().commit();
            System.out.println("Yes");

        }catch (Exception e){
            System.out.println("No");
        }
    }

}
