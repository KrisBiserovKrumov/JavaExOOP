package WorkshopTwo.core.factories.interfaces;

import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.models.Race;

public interface RaceFactory {
    Race produce(String[] args) throws ArgumentException;
}
