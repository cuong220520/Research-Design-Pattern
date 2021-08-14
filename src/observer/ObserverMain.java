package observer;

public class ObserverMain {

	public static void main(String[] args) {
		AccountService account = new AccountService("cuong225.cn@gmail.com", "127.0.0.1");
		
		account.attach(new Logger());
		account.attach(new Mailer());
		account.attach(new Protector());
		
		account.login();
		
		account.changeStatus(LoginStatus.EXPIRED);
	}

}
