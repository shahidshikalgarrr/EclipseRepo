//package day3;
//
//public class ShoppingCartLL implements Shopping { 
//    private Product[] items;
//    private double total;
//    private int count; 
//
//    public ShoppingCart() {
//        items = new Product[5];
//        count = 0;
//    }
//
//    public void addToCart(Product p) throws ShoppingException {
//  
//        if (p == null) {
//            System.out.println("No Product to add");
//            return; 
//        }
//        
//        if (count >= items.length) { 
//            throw new ShoppingException("Cart full! Cannot add more items");
//        }
//        
//        items[count] = p;
//        count++;
//        total += p.getPrice();
//        System.out.println(p + " added to cart");
//    }
//
//    public void checkout() {
//        if (count == 0) {
//            System.out.println("No items in the cart");
//            return; 
//        }
//        
//        for (int i = 0; i < count; i++) {
//            System.out.println(items[i]);
//        }
//        System.out.println("Total amount is " + total);
//    }
//}
