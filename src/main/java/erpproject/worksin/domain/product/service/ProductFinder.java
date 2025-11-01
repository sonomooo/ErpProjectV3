package erpproject.worksin.domain.product.service;

import erpproject.worksin.domain.product.code.ProductErrorCode;
import erpproject.worksin.domain.product.entity.Product;
import erpproject.worksin.domain.product.exception.ProductNotFoundException;
import erpproject.worksin.domain.product.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import static erpproject.worksin.domain.product.code.ProductErrorCode.PRODUCT_NOT_FOUND;

@Component
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Transactional
public class ProductFinder {

    private final ProductRepository productRepository;

    public Product getProductById(Long productId){

        return productRepository.findById(productId)
                .orElseThrow(ProductNotFoundException::new);
    }


}
