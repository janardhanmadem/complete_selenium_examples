package logs_appender;

import org.apache.log4j.Logger;
public class sample_app {
	public static void main(String[] args){
	
		Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
		APPLICATION_LOGS.debug("Starting");
		APPLICATION_LOGS.debug("executing");
		APPLICATION_LOGS.debug("ending");
		
	}

}
