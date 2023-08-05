package orm;

import orm.annotations.Id;

import java.lang.reflect.Field;
import java.sql.Connection;

public class EntityManager<E> implements DBContext<E> {

    private final Connection connection;

    public EntityManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean persist(E entity) throws IllegalAccessException {
        Field idField = getIdField(entity.getClass());
        idField.setAccessible(true);
        Object idValue = idField.get(entity);

        if (idValue == null || (long) idValue == 0) {
            return insertEntity(entity);
        }
        return false;
    }


    @Override
    public Iterable<E> find(Class<E> table) {
        return null;
    }

    @Override
    public Iterable<E> find(Class<E> table, String where) {
        return null;
    }

    @Override
    public E findFirst(Class<E> table) {
        return null;
    }

    @Override
    public E findFirst(Class<E> table, String where) {
        return null;
    }

    private Field getIdField(Class<?> entityClass) {
        Field[] declaredFields = entityClass.getDeclaredFields();

        for (Field declaredField : declaredFields){
            if (declaredField.isAnnotationPresent(Id.class)){
                return declaredField;
            }
        }
        throw new UnsupportedOperationException("Entity does not have ID column");
    }

    private boolean insertEntity(E entity) {
        return false;
    }
}












