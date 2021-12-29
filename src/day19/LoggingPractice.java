package day19;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingPractice {

    private static final Logger myLogger = Logger.getLogger("day19");

    public static void main(String[] args) {


//        Logger.getGlobal().setLevel(Level.WARNING);
//
//        Logger.getGlobal().severe("File-> message severe");
//        Logger.getGlobal().warning("File-> message warning");
//        Logger.getGlobal().info("File-> message info");
//        Logger.getGlobal().config("File-> message config");
//        Logger.getGlobal().fine("File-> message fine");
//        Logger.getGlobal().finer("File-> msg finer");
//        Logger.getGlobal().finest("File-> msg finest");

//        myLogger.setLevel(Level.OFF);
//        myLogger.setLevel(Level.WARNING);
        myLogger.setLevel(Level.OFF);

        myLogger.severe("File-> message severe");
        myLogger.warning("File-> message warning");
        myLogger.info("File-> message info");
        myLogger.config("File-> message config");
        myLogger.fine("File-> message fine");
        myLogger.finer("File-> msg finer");
        myLogger.finest("File-> msg finest");


    }
}
