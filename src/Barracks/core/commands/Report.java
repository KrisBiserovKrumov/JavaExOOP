package Barracks.core.commands;

import Barracks.contracts.Repository;
import Barracks.contracts.UnitFactory;

public class Report extends Command{

    protected Report(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return this.getRepository().getStatistics();
    }
}
