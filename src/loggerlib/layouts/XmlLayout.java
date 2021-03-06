package loggerlib.layouts;

import loggerlib.enumerations.ReportLevel;
import loggerlib.layouts.interfaces.Layout;

public class XmlLayout implements Layout {


    @Override
    public String format(String data, ReportLevel reportLevel, String message) {
        return String.format( "<log>\r\n" +
                    "<date>%s</date>\r\n" +
                    "<level>%s</level>\r\n" +
                    "<message>%s</message>\r\n" +
                "</log>\r\n",data,reportLevel.toString(),message);
    }
}
