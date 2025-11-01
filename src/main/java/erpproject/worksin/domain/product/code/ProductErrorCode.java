package erpproject.worksin.domain.product.code;

import erpproject.worksin.common.code.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ProductErrorCode implements ErrorCode {

    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND,"상품이 존재하지 않습니다");

    private final HttpStatus httpStatus;
    private final String message;
}
