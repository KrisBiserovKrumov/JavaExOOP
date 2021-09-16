package WorkshopTwo.repositories;

import WorkshopTwo.exceptions.DuplicateModelException;
import WorkshopTwo.exceptions.NonExistantModelException;
import WorkshopTwo.models.interfaces.ModelGetter;

public interface Repository<T extends ModelGetter> {
    void add(T entity) throws DuplicateModelException;
    T get(String model) throws NonExistantModelException;
}
