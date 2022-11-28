package io.github.emanuelmcp.api.database.repositories;

import java.util.List;

public interface CrudRepository <T, K>{
    void add(T t);
    List<T> getAll();
    List<T> findBySpecification(K id);
    void update(T oldObject, T newObject);
    void remove(Object id);
}
