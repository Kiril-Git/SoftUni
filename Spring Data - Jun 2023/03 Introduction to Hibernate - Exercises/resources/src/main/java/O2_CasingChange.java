import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class O2_CasingChange {
    public static void main(String[] args) {

        final EntityManager entityManager =
               Utils.createEntityManager();

        entityManager.getTransaction().begin();

        List<Town> allTowns = entityManager.createQuery("FROM Town", Town.class).
                getResultList();

        for (Town el : allTowns) {

            if (el.getName().length() > 5){
                entityManager.detach(el);
                continue;
            }
            el.setName(el.getName().toUpperCase());
            entityManager.persist(el);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
