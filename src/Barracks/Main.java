package Barracks;


import Barracks.contracts.Repository;
import Barracks.contracts.UnitFactory;
import Barracks.core.Engine;

import Barracks.core.factories.UnitFactoryImpl;
import Barracks.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
