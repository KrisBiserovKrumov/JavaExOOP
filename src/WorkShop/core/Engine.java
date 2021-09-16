package WorkShop.core;

import WorkShop.SystemClass;
import WorkShop.hardwareComponents.HeavyHardware;
import WorkShop.hardwareComponents.PowerHardware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine {

    private SystemClass system;

    public Engine(SystemClass system) {
        this.system = system;
    }

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        while (!input.equalsIgnoreCase("System Split")){
            String command = input.substring(0,input.indexOf("("));
            String[] cmdArcs = input.substring(input.indexOf("(") + 1,
                    input.length() - 1).split(", ");

            switch (command){
                case "RegisterPowerHardware":

                    this.system.addHardware(new PowerHardware(cmdArcs[0]
                            ,Integer.parseInt(cmdArcs[1])
                            ,Integer.parseInt(cmdArcs[2])));
                    break;
                case "RegisterHeavyHardware":
                    this.system.addHardware(new HeavyHardware(cmdArcs[0]
                            ,Integer.parseInt(cmdArcs[1])
                            ,Integer.parseInt(cmdArcs[2])));
                    break;
            }

            input = reader.readLine();
        }
    }
}
