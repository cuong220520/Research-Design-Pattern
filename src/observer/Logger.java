package observer;

public class Logger implements Observer {

	@Override
	public void update(User user) {
		System.out.println("Logged user: " + user.toString());
	}

}
