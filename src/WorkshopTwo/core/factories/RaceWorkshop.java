package WorkshopTwo.core.factories;

import WorkshopTwo.core.factories.interfaces.RaceFactory;
import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.models.Race;

public class RaceWorkshop implements RaceFactory {
    @Override
    public Race produce(String[] args) throws ArgumentException {
        return new Race(Integer.parseInt(args[1]),
                                    Integer.parseInt(args[2]),
                                    Integer.parseInt(args[3]),
                                    Boolean.parseBoolean(args[4]));
    }
}
