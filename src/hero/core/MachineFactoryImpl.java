package hero.core;

import hero.core.interfaces.MachineFactory;
import hero.entities.FighterImpl;
import hero.entities.TankImpl;
import hero.entities.interfaces.Fighter;
import hero.entities.interfaces.Tank;

public class MachineFactoryImpl implements MachineFactory {

    @Override
    public Tank createTank(String name, double attackPoints, double defensePoints) {
        return new TankImpl(name, attackPoints, defensePoints);
    }

    @Override
    public Fighter createFighter(String name, double attackPoints, double defensePoints) {
        return new FighterImpl(name, attackPoints, defensePoints);
    }
}
