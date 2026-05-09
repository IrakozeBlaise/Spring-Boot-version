package pl.edu.vistula.firstrestapispring.product.support.exception;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<RuntimeException> productNotFoundException() {
        return () -> new ProductNotFoundException("Product not found in database");
    }
}