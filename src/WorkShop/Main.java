package WorkShop;

import WorkShop.core.Engine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SystemClass system = new SystemClass();
        Engine engine = new Engine(system);

        engine.run();
    }
}
