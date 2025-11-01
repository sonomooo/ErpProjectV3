package erpproject.worksin.domain.product.exception;

import erpproject.worksin.common.exception.GlobalException;
import erpproject.worksin.domain.product.code.ProductErrorCode;

public class ProductNotFoundException extends GlobalException {

    public ProductNotFoundException() {
        super(ProductErrorCode.PRODUCT_NOT_FOUND);
    }
}
