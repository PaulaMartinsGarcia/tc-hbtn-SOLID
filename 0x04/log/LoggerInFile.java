package log_file;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerInFile {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("MyLog");

        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("logs.txt");
            Logger.addHandler(fileHandler);
            simpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            Logger.info("Log test");

        }catch (SecurityException e){
            logger.info("Exception:" + e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            logger.info("IOException:" + e.getMessage());
            e.printStackTrace();
        }
        Logger.info("Hi In the main class test");

    }
}
