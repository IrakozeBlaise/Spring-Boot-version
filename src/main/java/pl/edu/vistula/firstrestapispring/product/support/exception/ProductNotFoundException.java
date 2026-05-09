package pl.edu.vistula.firstrestapispring.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }
}