import entities.Department;
import entities.User;
import orm.EntityManager;
import orm.config.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws SQLException, IllegalAccessException {

        Connector.createConnection("root", "V_l4edr_m", "soft_uni");

        Connection connection = Connector.getConnection();

        EntityManager<User> userEntityManager = new EntityManager<>(connection);
        userEntityManager.persist(new User("u", "p", 12, LocalDate.now()));

        EntityManager<Department> departmentEntityManager = new EntityManager<>(connection);
        departmentEntityManager.persist(new Department());
    }
}






























