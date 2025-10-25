package erpproject.worksin.domain.product.service;

import erpproject.worksin.domain.product.dto.request.ProductRequest;
import erpproject.worksin.domain.product.dto.response.ProductResponse;
import erpproject.worksin.domain.product.entity.Product;
import erpproject.worksin.domain.product.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductService {

    private final ProductRepository productRepository;

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
}
