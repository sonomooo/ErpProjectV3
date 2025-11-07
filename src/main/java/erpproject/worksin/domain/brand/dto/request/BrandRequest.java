package erpproject.worksin.domain.brand.dto.request;

import erpproject.worksin.domain.brand.enums.BrandStatus;
import erpproject.worksin.domain.product.entity.Product;

import java.util.List;

public record BrandRequest (String name,
                            String description,
                            String logoUrl,
                            String homePageUrl,
                            BrandStatus status,
                            List<Product> products) {

}
