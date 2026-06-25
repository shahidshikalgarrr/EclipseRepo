package day3;


public class ShoppingCart implements Shopping { 
	private LinkedList<Product> items;
    private double total;
//    private int count; 

    public ShoppingCart() {
        items = new LinkedList<>();
    }

    public void addToCart(Product p) throws ShoppingException {
  
        if (p == null) {
            System.out.println("No Product to add");
            return; 
        }
        
        if (items.Size() >= 5) { 
            throw new ShoppingException("Cart full! Cannot add more items");
        }
        
        items.add(p);
        total += p.getPrice();
        System.out.println(p + " added to cart");
    }

    public void checkout() {
        if (items.Size() == 0) {
            System.out.println("No items in the cart");
            return; 
        }
        
        items.print();
        System.out.println("Total amount is " + total);
    }
}
