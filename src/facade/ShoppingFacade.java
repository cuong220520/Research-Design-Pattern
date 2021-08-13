package facade;

public class ShoppingFacade {
	
	private AccountService accountService;
	private EmailService emailService;
	private PaymentService paymentService;
	private ShippingService shippingService;
	private SmsService smsService;

	private ShoppingFacade() {
		this.accountService = new AccountService();
		this.emailService = new EmailService();
		this.paymentService = new PaymentService();
		this.shippingService = new ShippingService();
		this.smsService = new SmsService();
	}
	
	public static ShoppingFacade getInstance() {
		return ShoppingFacadeHelper.INSTANCE;
	}
	
	private static class ShoppingFacadeHelper {
		private static final ShoppingFacade INSTANCE = new ShoppingFacade();
	}
	
	public void buyProductByCashWithFreeShipping(String email) {
		accountService.getAccount(email);
		paymentService.paymentByCash();
		shippingService.freeShipping();
		emailService.sendMail(email);
		System.out.println("Done\n");
	}
	
	public void buyProductByPayPalWithStandardShipping(String email, String mobilePhone) {
		accountService.getAccount(email);
		paymentService.paymentByPayPal();
		shippingService.standardShipping();
		emailService.sendMail(email);
		smsService.sendSms(mobilePhone);
		System.out.println("Done\n");
	}
	
}
