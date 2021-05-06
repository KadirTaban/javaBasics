package nLayeredDemo.src.nLayeredDemo.core;

import nLayeredDemo.src.nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

    @Override
    public void logToSystem(String message){

        jLoggerManager manager = new jLoggerManager();
        manager.log(message);

    }

}
