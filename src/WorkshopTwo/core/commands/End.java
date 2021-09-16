package hero.core.commands;

import WorkshopTwo.core.commands.interfaces.Command;

public class End implements Command {
    @Override
    public String execute(String[] args) {
        return args[0];
    }
}
