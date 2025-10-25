package erpproject.worksin.domain.product.controller;

import erpproject.worksin.domain.product.dto.request.ProductRequest;
import erpproject.worksin.domain.product.dto.response.ProductResponse;
import erpproject.worksin.domain.product.service.ProductService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductController {

    private final ProductService productService;

    @PostMapping("/v1/product")
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){

        return productService.createProduct(productRequest);
    }
}
