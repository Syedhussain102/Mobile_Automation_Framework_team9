package Encrypt;

import org.apache.log4j.Logger;

public class Log4jTry {

    Logger log = Logger.getLogger(Log4jTry.class);


    public String execute() {
        log.info("st");
        log.fatal("rtg" + execute());
        return null;
    }
}
