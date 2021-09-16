package WorkshopTwo.core.commands.raceCommands;

import WorkshopTwo.core.controllers.interfaces.RaceManager;

public class GetStatistic extends RaceCommand {
    public GetStatistic(RaceManager raceController) {
        super(raceController);
    }

    @Override
    public String execute(String[] args) {
        return this.getRaceController().getStatistics();
    }
}
