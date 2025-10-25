package erpproject.worksin.domain.product.service;

import erpproject.worksin.domain.product.entity.Product;
import erpproject.worksin.domain.product.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)

public class ProductEntityFinder {

    private final ProductRepository productRepository;

    public Product getProductById(Long productId){

       return productRepository.findById(productId).orElseThrow();
    }
}
