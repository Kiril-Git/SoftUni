import entities.Address;
import entities.Employee;

public class O7_EmployeesAtAddress {
    public static void main(String[] args) {

        Utils.createEntityManager()
                .createQuery("FROM Address  ORDER BY employees.size DESC", Address.class)
                .setMaxResults(10)
                .getResultList()
                .forEach(Address::printGeneralInfo);
    }
}
