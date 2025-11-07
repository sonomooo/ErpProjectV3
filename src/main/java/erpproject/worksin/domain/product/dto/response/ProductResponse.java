package erpproject.worksin.domain.product.dto.response;

import erpproject.worksin.domain.brand.entity.Brand;
import erpproject.worksin.domain.product.entity.Product;
import erpproject.worksin.domain.product.enums.SizeStatus;
import lombok.Builder;

@Builder
public record ProductResponse (Long id,
                               String name,
                               String cereal,
                               String price,
                               SizeStatus size,
                               Brand brand,
                               String model_info,
                               String explain){

    public static ProductResponse from(Product product){

        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .cereal(product.getCereal())
                .price(product.getPrice())
                .size(product.getSize())
                .brand(product.getBrand())
                .model_info(product.getModel_info())
                .explain(product.getExplain())
                .build();

    }
}
