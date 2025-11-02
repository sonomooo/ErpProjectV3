package erpproject.worksin.domain.product.service;

import erpproject.worksin.common.response.ApiResponse;
import erpproject.worksin.domain.product.dto.request.ProductRequest;
import erpproject.worksin.domain.product.dto.response.ProductResponse;
import erpproject.worksin.domain.product.entity.Product;
import erpproject.worksin.domain.product.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductFinder productFinder;

    public ProductResponse createProduct(ProductRequest productRequest){

        Product product = Product.of(productRequest.brand(),
                productRequest.cereal(),
                productRequest.explain(),
                productRequest.model_info(),
                productRequest.name(),
                productRequest.price(),
                productRequest.size());

        productRepository.save(product);

        return ProductResponse.from(product);
    }

    public Void DeleteProduct(Long productId){

        return productRepository.delete(productId);
    }

    public ProductResponse getProduct(Long productId) {
        Product productById = productFinder.getProductById(productId);

        return ProductResponse.from(productById);
    }

    public ProductResponse updateProduct(Long productId, ProductRequest productRequest) {
        Product productById = productFinder.getProductById(productId);

        Product product = Product.of(productRequest.brand(),
                productRequest.cereal(),
                productRequest.explain(),
                productRequest.model_info(),
                productRequest.name(),
                productRequest.price(),
                productRequest.size());

        return ProductResponse.from(product);


    }

}
