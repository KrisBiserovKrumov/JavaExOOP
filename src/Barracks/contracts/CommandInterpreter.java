package Barracks.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
