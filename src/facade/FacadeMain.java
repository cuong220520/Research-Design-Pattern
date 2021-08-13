package facade;

public class FacadeMain {
	public static void main(String[] args) {
		ShoppingFacade shoppingFacade = ShoppingFacade.getInstance();
		
		shoppingFacade.buyProductByCashWithFreeShipping("cuong225.cn@gmail.com");
		shoppingFacade.buyProductByPayPalWithStandardShipping("cuong225.cn@gmail.com", "0911243204");
	}
}
