package WorkshopTwo.core.controllers.interfaces;


import WorkshopTwo.exceptions.*;
import WorkshopTwo.models.boats.Boat;
import WorkshopTwo.models.Race;

public interface RaceManager {
    void setRace(Race race) throws RaceAlreadyExistsException;
    void addBoat(Boat boat) throws DuplicateModelException, ArgumentException, NoSetRaceException;
    void startRace() throws InsufficientContestantsException, NoSetRaceException;
    String getRaceResult();
    String getStatistics();
}
