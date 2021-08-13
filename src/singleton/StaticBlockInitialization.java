package singleton;

public class StaticBlockInitialization {
	private static final StaticBlockInitialization INSTANCE;

	private StaticBlockInitialization() {
	}

	static {
		try {
			INSTANCE = new StaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurs when creating singleton instance");
		}
	}

	public static StaticBlockInitialization getInstance() {
		return INSTANCE;
	}
	
	private String message = "Hello, I'm static block initialization's message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
