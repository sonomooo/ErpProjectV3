package ErpProject.ErpProjectV3.domain.brand.dto.response;

import ErpProject.ErpProjectV3.domain.brand.entity.Brand;
import lombok.Builder;

@Builder
public record BrandResponse (String brandName){

    public static BrandResponse from(Brand brand){

        return BrandResponse.builder()
                .brandName(brand.getName())
                .build();

    }
}
