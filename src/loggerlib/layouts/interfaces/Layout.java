package loggerlib.layouts.interfaces;

import loggerlib.enumerations.ReportLevel;

public interface Layout {
    String format (String data, ReportLevel reportLevel, String message);
}
