package loggerlib.layouts;

import loggerlib.enumerations.ReportLevel;
import loggerlib.layouts.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String format(String data, ReportLevel reportLevel, String message) {
        return String.format("%s - %s - %s",data,reportLevel.toString(),message);
    }
}
