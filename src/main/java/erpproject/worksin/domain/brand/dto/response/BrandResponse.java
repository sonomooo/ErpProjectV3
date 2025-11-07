package erpproject.worksin.domain.brand.dto.response;

import erpproject.worksin.domain.brand.entity.Brand;
import erpproject.worksin.domain.brand.enums.BrandStatus;
import erpproject.worksin.domain.product.entity.Product;
import lombok.Builder;

import java.util.List;

@Builder
public record BrandResponse (String name,
                             String description,
                             String logoUrl,
                             String homePageUrl,
                             BrandStatus status,
                             List<Product> products) {

    public static BrandResponse from(Brand brand){

        return BrandResponse.builder()
                .name(brand.getName())
                .description(brand.getDescription())
                .logoUrl(brand.getLogoUrl())
                .homePageUrl(brand.getHomepageUrl())
                .status(brand.getStatus())
                .products(brand.getProducts())
                .build();
    }
}
