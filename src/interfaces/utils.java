package interfaces;

public class utils {
    public static void runLoggers(Logger[] loggers,String message ){
        for(Logger logger : loggers) {
            logger.log(message);

        }

    }
}
