package singleton;

public class DoubleCheckInitilization {

	private static volatile DoubleCheckInitilization instance;
	
	private DoubleCheckInitilization() {
		
	}
	
	public static DoubleCheckInitilization getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckInitilization.class) {
				if (instance == null) {
					instance = new DoubleCheckInitilization();
				}
			}
		}
		
		return instance;
	}
	
	private String message = "Hello, I'm double check initialization's message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
