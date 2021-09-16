package WorkshopTwo.core.commands.raceCommands;

import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.exceptions.DuplicateModelException;
import WorkshopTwo.exceptions.NoSetRaceException;
import WorkshopTwo.exceptions.NonExistantModelException;
import WorkshopTwo.models.boats.Boat;
import WorkshopTwo.core.controllers.interfaces.RaceManager;
import WorkshopTwo.repositories.Repository;

public class SignUpBoat extends RaceCommand {
    private Repository<Boat> boatRepository;

    public SignUpBoat(RaceManager raceController, Repository<Boat> boatRepository) {
        super(raceController);
        this.boatRepository = boatRepository;
    }

    @Override
    public String execute(String[] args) {
        String message;

        String model = args[1];

        try {
            this.getRaceController().addBoat(this.boatRepository.get(model));
            message = String.format("Boat with model %s has signed up for the current Race.", model);
        } catch (DuplicateModelException | ArgumentException | NoSetRaceException | NonExistantModelException e) {
            message = e.getMessage();
        }

        return message;
    }
}
