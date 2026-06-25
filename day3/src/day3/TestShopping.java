package day3;

public class TestShopping {
	
	public static void main(String[] args) {
		
//		ShoppingCart cart = new ShoppingCart();
//		CartFactory factory = new CartFactory();
		Shopping cart = CartFactory.newCart();
		
		try {
			cart.addToCart(new Product("Books", 500));
			cart.addToCart(new Product("bag", 1500));
			cart.addToCart(new Product("bag", 1500));
			cart.addToCart(new Product("bag", 1500));
			cart.addToCart(new Product("bag", 1500));
			cart.addToCart(new Product("bag", 1500));
		} catch (ShoppingException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage()); 
		}
				
		System.out.println("Items in cart: ");
		cart.checkout();
		
	}

}
