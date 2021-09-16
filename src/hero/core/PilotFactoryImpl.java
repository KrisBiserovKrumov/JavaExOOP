package hero.core;

import hero.core.interfaces.PilotFactory;
import hero.entities.PilotImpl;
import hero.entities.interfaces.Pilot;

public class PilotFactoryImpl implements PilotFactory {


    @Override
    public Pilot createPilot(String name) {
        return new PilotImpl(name);
    }
}
