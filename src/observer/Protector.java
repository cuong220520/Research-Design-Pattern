package observer;

public class Protector implements Observer {

	@Override
	public void update(User user) {
		if (user.getLoginStatus() == LoginStatus.INVALID) {
			System.out.printf("User: %s with IP: %s is blocked by protector\n", user.getEmail(), user.getIp());
		}
	}

}
