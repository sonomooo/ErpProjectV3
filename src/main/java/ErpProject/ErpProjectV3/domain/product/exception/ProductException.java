package ErpProject.ErpProjectV3.domain.product.exception;

import ErpProject.ErpProjectV3.common.exception.ErrorCode;
import ErpProject.ErpProjectV3.common.exception.GlobalException;

public class ProductException extends GlobalException {

    public ProductException(ErrorCode errorCode){
        super(errorCode);
    }
}
