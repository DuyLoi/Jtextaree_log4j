public static void main( String[] args ){
        
    TextArea logTextArea = new TextArea();
    logTextArea.setSizeFull();

    MyCustomAppender.logTextArea = logTextArea;

    try{
        Properties loggingProperties = new Properties();
        loggingProperties.load( getClass().getResourceAsStream( "/log4j-config.properties" ) );

        PropertyConfigurator.configure( loggingProperties );
    }
    catch( Exception e ){
    }
        
}
