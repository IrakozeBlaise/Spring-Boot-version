package pl.edu.vistula.firstrestapispring.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.firstrestapispring.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapispring.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapispring.product.domain.Product;
import pl.edu.vistula.firstrestapispring.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapispring.product.support.ProductMapper;
import pl.edu.vistula.firstrestapispring.product.support.exception.ProductExceptionSupplier;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    // CREATE - Add a new product
    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }

    // READ - Get product by ID
    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFoundException());
        return productMapper.toProductResponse(product);
    }

    // READ - Get all products
    public List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductResponse)
                .collect(Collectors.toList());
    }

    // UPDATE - Update an existing product
    public ProductResponse update(Long id, ProductRequest productRequest) {
        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFoundException());

        product.setName(productRequest.getName());
        Product updatedProduct = productRepository.save(product);
        return productMapper.toProductResponse(updatedProduct);
    }

    // DELETE - Delete a product
    public void delete(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFoundException());
        productRepository.delete(product);
    }
}