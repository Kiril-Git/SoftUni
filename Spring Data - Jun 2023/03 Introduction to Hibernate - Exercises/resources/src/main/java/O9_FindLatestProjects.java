import entities.Address;
import entities.Project;

public class O9_FindLatestProjects {
    public static void main(String[] args) {

        Utils.createEntityManager()
                .createQuery("FROM Project  ORDER BY startDate DESC", Project.class)
                .setMaxResults(10)
                .getResultList()
                .stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(Project::printLatestProjects);
    }

}
