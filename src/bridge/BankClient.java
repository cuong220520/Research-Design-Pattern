package bridge;

public class BankClient {

	public static void main(String[] args) {
		Bank vietcombank = new Vietcombank(new CheckingAccount());
		vietcombank.openAccount();
		
		Bank tpBank = new TPBank(new SavingAccount());
		tpBank.openAccount();
	}

}
