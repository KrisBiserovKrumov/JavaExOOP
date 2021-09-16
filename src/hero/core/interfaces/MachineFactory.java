package hero.core.interfaces;

import hero.entities.interfaces.Fighter;
import hero.entities.interfaces.Tank;

public interface MachineFactory {
    Tank createTank(String name, double attackPoints, double defensePoints);

    Fighter createFighter(String name, double attackPoints, double defensePoints);
}
