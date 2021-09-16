package WorkshopTwo.core.commands.raceCommands;

import WorkshopTwo.core.commands.interfaces.Command;
import WorkshopTwo.core.controllers.interfaces.RaceManager;

public abstract class RaceCommand implements Command {
    private RaceManager raceController;

    protected RaceCommand(RaceManager raceController) {
        this.raceController = raceController;
    }

    protected RaceManager getRaceController() {
        return this.raceController;
    }
}
