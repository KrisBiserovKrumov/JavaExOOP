package WorkshopTwo.core.commands.raceCommands;

import WorkshopTwo.exceptions.InsufficientContestantsException;
import WorkshopTwo.exceptions.NoSetRaceException;
import WorkshopTwo.core.controllers.interfaces.RaceManager;

public class StartRace extends RaceCommand {
    public StartRace(RaceManager raceController) {
        super(raceController);
    }

    @Override
    public String execute(String[] args) {
        String message;
        try {
            this.getRaceController().startRace();
            message = this.getRaceController().getRaceResult();
        } catch (InsufficientContestantsException | NoSetRaceException e) {
           message = e.getMessage();
        }

        return message;
    }
}
