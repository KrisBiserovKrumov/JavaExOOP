package hero.core.interfaces;

import hero.entities.interfaces.Pilot;

public interface PilotFactory {
    Pilot createPilot(String name);
}
