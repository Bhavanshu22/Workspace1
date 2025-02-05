package Log4JDemo;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[] args) 
	{
		Logger log = LogManager.getLogger("LoggerDemo");
		
		System.out.println("this is Logger Demo");
		
		log.info("info msg only");
		log.debug("debug only");
		log.error("Error Message");
		log.warn("Warning message");

	}

}
