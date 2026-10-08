package data;

import domain.Entity;

import java.util.List;
import java.util.Optional;

public interface Crudable <T extends Entity<ID>, ID> {
    Optional<T> getById(ID id);
    List<T> getAll();
    T create(T entity);
    boolean update(T entity);
    boolean delete(ID id);
}
