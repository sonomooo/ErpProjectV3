package ErpProject.ErpProjectV3.domain.product.service;

import ErpProject.ErpProjectV3.common.exception.ProductErrorCode;
import ErpProject.ErpProjectV3.domain.product.dto.request.ProductRequest;
import ErpProject.ErpProjectV3.domain.product.dto.response.ProductResponse;
import ErpProject.ErpProjectV3.domain.product.entity.Product;
import ErpProject.ErpProjectV3.domain.product.exception.ProductException;
import ErpProject.ErpProjectV3.domain.product.mapper.ProductMapper;
import ErpProject.ErpProjectV3.domain.product.repository.ProductRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepositoryImpl productRepository;

    public ProductResponse createProduct(ProductRequest productRequest){

        Product product = productMapper.toEntity(productRequest);

        productRepository.save(product);

        return productMapper.toResponse(productRequest);
    }

    public ProductResponse findProductById(Long productId){

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ProductException(ProductErrorCode.PRODUCT_NOT_FOUND));

        return productMapper.toResponseByProduct(product);
    }

    public Page<ProductResponse> findProductsById(String keyWord,int page, int size){

        PageRequest pageRequest = PageRequest.of(page,size);

        Page<Product> byProductNameContaining = productRepository.findByProductNameContaining(keyWord, pageRequest);

        return productMapper.toProductResponseByProductPage(byProductNameContaining);
    }

    public void deleteProductById(Long id){

        productRepository.deleteById(id);
    }

}
