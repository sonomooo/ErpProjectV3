package erpproject.worksin.domain.product.dto.request;

import erpproject.worksin.domain.brand.Brand;
import erpproject.worksin.domain.product.enums.SizeStatus;

public record ProductRequest(String name,
                             String cereal,
                             String price,
                             SizeStatus size,
                             Brand brand,
                             String model_info,
                             String explain
) {


}
