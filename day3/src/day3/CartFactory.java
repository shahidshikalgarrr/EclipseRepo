package day3;

public final class CartFactory {
	private CartFactory(){}

		public static Shopping newCart() {

			return new ShoppingCart();
}
}
