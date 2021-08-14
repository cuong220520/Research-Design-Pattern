package observer;

public class Mailer implements Observer {

	@Override
	public void update(User user) {
		if (user.getLoginStatus() == LoginStatus.EXPIRED) {
			System.out.println("User " + user.getEmail() + " is expired");
		}
	}

}
