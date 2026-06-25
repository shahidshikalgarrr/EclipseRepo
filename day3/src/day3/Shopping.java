package day3;

public interface Shopping {
    void addToCart(Product p) throws ShoppingException;
    void checkout();
}