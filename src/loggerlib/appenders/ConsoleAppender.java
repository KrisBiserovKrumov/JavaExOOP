package loggerlib.appenders;

import loggerlib.enumerations.ReportLevel;
import loggerlib.layouts.interfaces.Layout;


public class ConsoleAppender extends AppenderImpl{
    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    public ConsoleAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    @Override
    public void append( String data, ReportLevel reportLevel, String message) {
        System.out.println(this.format( data,  reportLevel,  message));
    }


}
