package WorkshopTwo;

import WorkshopTwo.core.commandInterpreter.CommandHandler;
import WorkshopTwo.core.factories.BoatWorkshop;
import WorkshopTwo.core.factories.CommandWorkshop;
import WorkshopTwo.core.controllers.MainController;
import WorkshopTwo.core.factories.EngineWorkshop;
import WorkshopTwo.core.factories.interfaces.CommandFactory;
import WorkshopTwo.io.InputManager;
import WorkshopTwo.io.OutputManager;
import WorkshopTwo.models.boats.Boat;
import WorkshopTwo.models.engines.Engine;
import WorkshopTwo.core.controllers.RaceController;
import WorkshopTwo.repositories.Repository;
import WorkshopTwo.repositories.RepositoryImpl;

public class Main {
    public static void main(String[] args) {
        Repository<Boat> boatRepository = new RepositoryImpl<>();
        Repository<Engine> engineRepository = new RepositoryImpl<>();
        CommandFactory commandFactory =
                new CommandWorkshop(new EngineWorkshop(), new BoatWorkshop(engineRepository), engineRepository, boatRepository, new RaceController());
        MainController controller = new MainController(new InputManager(), new OutputManager(), new CommandHandler(commandFactory));
        controller.run();
    }
}
