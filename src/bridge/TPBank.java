package bridge;

public class TPBank extends Bank {
	
	public TPBank(Account account) {
		super(account);
	}

	@Override
	protected void openAccount() {
		System.out.print("Your opened account at TPBank is: ");
		account.openAccount();
	}

}
