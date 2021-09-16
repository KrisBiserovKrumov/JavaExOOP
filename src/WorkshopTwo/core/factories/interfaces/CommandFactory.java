package WorkshopTwo.core.factories.interfaces;

import WorkshopTwo.core.commands.interfaces.Command;

public interface CommandFactory {
    Command produce(String type);
}
