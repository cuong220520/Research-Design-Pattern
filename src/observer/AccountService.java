package observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {
	
	private User user;
	
	private List<Observer> observers = new ArrayList<>();
	
	public AccountService(String email, String ip) {
		this.user = new User();
		this.user.setEmail(email);
		this.user.setIp(ip);
	}

	@Override
	public void attach(Observer observer) {
		if (!this.observers.contains(observer)) {
			this.observers.add(observer);
		}
	}

	@Override
	public void detach(Observer observer) {
		if (this.observers.contains(observer)) {
			this.observers.remove(observer);
		}
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : this.observers) {
			observer.update(this.user);
		}
	}
	
	public void changeStatus(LoginStatus loginStatus) {
		this.user.setLoginStatus(loginStatus);
		System.out.println("Login status is changed");
		notifyAllObserver();
	}
	
	public void login() {
		if (!isValidIp()) {
			this.user.setLoginStatus(LoginStatus.INVALID);
		} else if (isValidEmail()) {
			this.user.setLoginStatus(LoginStatus.SUCCESS);
		} else this.user.setLoginStatus(LoginStatus.FAILURE);
		
		System.out.println("Login is handled");
		notifyAllObserver();
	}

	private boolean isValidEmail() {
		return "cuong225.cn@gmail.com".equals(user.getEmail());
	}

	private boolean isValidIp() {
		return "127.0.0.1".equals(user.getIp());
	}
	
	

}
