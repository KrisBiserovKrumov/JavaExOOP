package WorkshopTwo.core.factories.interfaces;

import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.models.engines.Engine;

public interface EngineFactory {
    Engine produce(String[] args) throws ArgumentException;
}
