package bridge;

public class Vietcombank extends Bank {

	public Vietcombank(Account account) {
		super(account);
	}

	@Override
	protected void openAccount() {
		System.out.print("Your opened account at Vietcombank is: ");
		account.openAccount();
	}

}
