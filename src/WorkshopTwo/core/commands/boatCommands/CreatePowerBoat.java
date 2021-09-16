package WorkshopTwo.core.commands.boatCommands;

import WorkshopTwo.core.factories.interfaces.BoatFactory;
import WorkshopTwo.models.boats.Boat;
import WorkshopTwo.repositories.Repository;

public class CreatePowerBoat extends BoatCommand {
    public CreatePowerBoat(Repository<Boat> boatRepository, BoatFactory boatFactory) {
        super(boatRepository, boatFactory);
    }
}
