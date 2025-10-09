package ErpProject.ErpProjectV3.domain.product.dto.response;

import lombok.Builder;

@Builder
public record ProductResponse (
        String productName,
        String code,
        String category,
        String brand,
        String price,
        String description
){}
