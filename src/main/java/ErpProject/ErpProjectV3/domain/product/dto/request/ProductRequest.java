package ErpProject.ErpProjectV3.domain.product.dto.request;

import lombok.Getter;

@Getter
public class ProductRequest {

    private String productName;
    private String code;
    private String category;
    private String brand;
    private String stockQuantity;
    private String location;
    private String price;
    private String description;
}
