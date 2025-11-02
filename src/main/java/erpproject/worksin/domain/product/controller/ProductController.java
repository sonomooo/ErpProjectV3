package erpproject.worksin.domain.product.controller;

import erpproject.worksin.common.response.ApiResponse;
import erpproject.worksin.domain.product.dto.request.ProductRequest;
import erpproject.worksin.domain.product.dto.response.ProductResponse;
import erpproject.worksin.domain.product.service.ProductService;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductController {

    private final ProductService productService;

    @PostMapping("/v1/product")
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest){

        return productService.createProduct(productRequest);
    }

    @GetMapping("/v1/product/{productId}")
    public ResponseEntity<ApiResponse<ProductResponse>> getProduct(@PathVariable Long productId){

        ProductResponse product = productService.getProduct(productId);

        return ApiResponse.success(product);
    }

    @DeleteMapping("/v1/product/{productId}")
    public ResponseEntity<ApiResponse<Void>> deleteProduct(@PathVariable Long productId){

        return ApiResponse.noContent(productService.DeleteProduct(productId));
    }

    @PatchMapping("/v1/product/{productId}")
    public ResponseEntity<ApiResponse<ProductResponse>> updateProduct(@PathVariable Long productId,
                                                                      @RequestBody ProductRequest productRequest){

        productService.updateProduct();

    }
}
