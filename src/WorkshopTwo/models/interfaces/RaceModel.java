package WorkshopTwo.models.interfaces;

import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.exceptions.DuplicateModelException;
import WorkshopTwo.exceptions.InsufficientContestantsException;
import WorkshopTwo.models.boats.Boat;

import java.util.Set;

public interface RaceModel {
    int getDistance();
    int getCurrentSpeed();
    int getWindSpeed();
    boolean allowsMotorBoats();
    Set<Boat> getParticipants();
    void startRace() throws InsufficientContestantsException;
    void addParticipant(Boat participant) throws DuplicateModelException, ArgumentException;
    String getStatistics();
    String getResult();
}
