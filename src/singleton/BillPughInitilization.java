package singleton;

public class BillPughInitilization {
	// create a nested static class SingletonHelper class
	// SingletonHelper class is only called when getInstance() is called
	// => avoid multiple threads errors and high performance
	
	private BillPughInitilization() {
		
	}
	
	public static BillPughInitilization getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	private static class SingletonHelper {
		private static final BillPughInitilization INSTANCE = new BillPughInitilization();
	}
	
	private String message = "Hello, I'm bill pugh initialization's message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
