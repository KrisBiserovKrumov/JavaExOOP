package Barracks.core.commands;

import Barracks.contracts.Executable;
import Barracks.contracts.Repository;
import Barracks.contracts.UnitFactory;

public abstract class Command implements Executable {

    private String [] data;
    private Repository repository;
    private UnitFactory unitFactory;

    public Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
