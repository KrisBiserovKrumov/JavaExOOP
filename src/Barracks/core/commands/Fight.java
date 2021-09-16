package Barracks.core.commands;

import Barracks.contracts.Repository;
import Barracks.contracts.UnitFactory;

public class Fight  extends Command{

    public Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
