package lab7.singletonPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
	private static Logger instance;

	private Logger() {
	}

	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public void log(String message) {
		String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMM-dd HH:mm:ss"));
		System.out.println("[" + timestamp + "] " + message);
	}

}
