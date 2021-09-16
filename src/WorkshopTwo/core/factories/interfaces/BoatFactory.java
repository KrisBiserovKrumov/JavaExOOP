package WorkshopTwo.core.factories.interfaces;

import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.exceptions.NonExistantModelException;
import WorkshopTwo.models.boats.Boat;

public interface BoatFactory {
    Boat produce(String[] args) throws ArgumentException, NonExistantModelException;
}
