package singleton;

public class EagerInitialization {

	private static final EagerInitialization INSTANCE = new EagerInitialization();
	
	private EagerInitialization() {};
	
	public static EagerInitialization getInstance() {
		return INSTANCE;
	}
	
	private String message = "Hello, I'm eager initialization's message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
