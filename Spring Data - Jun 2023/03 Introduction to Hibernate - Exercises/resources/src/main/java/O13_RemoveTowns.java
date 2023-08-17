import entities.Address;
import entities.Employee;
import entities.Town;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class O13_RemoveTowns {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final EntityManager entityManager = Utils.createEntityManager();

        String town = scanner.nextLine();

        final Town townDel = entityManager.createQuery(
                "FROM Town WHERE name = :town ", Town.class)
                .setParameter("town", town )
                .getSingleResult();

        final List<Address> addressesDel = entityManager.createQuery(
                "FROM Address  WHERE town.id = :id", Address.class)
                .setParameter("id", townDel.getId())
                        .getResultList();

        addressesDel.forEach(t -> t.getEmployees()
                .forEach(employee -> employee.setAddress(null)));

        addressesDel.forEach(entityManager::remove);
        entityManager.remove(townDel);

        final int countDelAddresses = addressesDel.size();

        System.out.printf("%d address%s in %s deleted",
                countDelAddresses,
                countDelAddresses == 1 ? "" : "es",
                town);

        entityManager.getTransaction().commit();
    }
}
