package WorkshopTwo.core.commands.raceCommands;

import WorkshopTwo.core.factories.interfaces.RaceFactory;
import WorkshopTwo.core.factories.RaceWorkshop;
import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.exceptions.RaceAlreadyExistsException;
import WorkshopTwo.models.Race;
import WorkshopTwo.core.controllers.interfaces.RaceManager;

public class OpenRace extends RaceCommand {
    private RaceFactory raceFactory;

    public OpenRace(RaceManager raceController) {
        super(raceController);
        raceFactory = new RaceWorkshop();
    }

    @Override
    public String execute(String[] args) {
        String message;
        try {
            Race race = this.raceFactory.produce(args);
            this.getRaceController().setRace(race);
            message =
                    String.format(
                            "A new race with distance %d meters, " +
                                    "wind speed %d m/s and ocean current speed %d m/s has been set.",
                    race.getDistance(), race.getWindSpeed(), race.getCurrentSpeed());
        } catch (ArgumentException | RaceAlreadyExistsException e) {
            message = e.getMessage();
        }

        return message;
    }
}
