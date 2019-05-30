package com.abc;

import org.apache.log4j.WriterAppender;
import org.apache.log4j.spi.LoggingEvent;

import com.vaadin.ui.TextArea;

public class MyCustomAppender extends WriterAppender{

    public static TextArea logTextArea;

    @Override
    public void append( LoggingEvent loggingEvent ){

        final String logMessage = this.layout.format( loggingEvent );

        logTextArea.setValue( logTextArea.getValue() + logMessage );
    }

}
