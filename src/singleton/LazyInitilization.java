package singleton;

public class LazyInitilization {

	private static LazyInitilization instance;

	private LazyInitilization() {

	}

	public static LazyInitilization getInstance() {
		if (instance == null) {
			instance = new LazyInitilization();
		}

		return instance;
	}
	
	private String message = "Hello, I'm lazy initialization's message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
