package singleton;

public class ThreadSafeInitilization {

	private static volatile ThreadSafeInitilization instance;
	// volatile inform this variable is used by other thread if it is used by multiple thread
	
	private ThreadSafeInitilization() {
		
	}
	
	public static synchronized ThreadSafeInitilization getInstance() {
		if (instance == null) {
			instance = new ThreadSafeInitilization();
		}
		
		return instance;
	}
	
	private String message = "Hello, I'm thread safe initialization's message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
