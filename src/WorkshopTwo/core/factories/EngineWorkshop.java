package WorkshopTwo.core.factories;

import WorkshopTwo.core.factories.interfaces.EngineFactory;
import WorkshopTwo.exceptions.ArgumentException;
import WorkshopTwo.models.engines.Engine;
import WorkshopTwo.models.engines.Jet;
import WorkshopTwo.models.engines.Sterndrive;

public class EngineWorkshop implements EngineFactory {
    @Override
    public Engine produce(String[] args) throws ArgumentException {
        String type = args[args.length - 1];

        String model = args[1];
        int hp = Integer.parseInt(args[2]);
        int dis = Integer.parseInt(args[3]);

        Engine engine = null;

        switch (type) {
            case "Jet":
                engine = new Jet(model, hp, dis);
                break;
            case "Sterndrive":
                engine = new Sterndrive(model, hp, dis);
                break;
        }
        return engine;
    }
}
