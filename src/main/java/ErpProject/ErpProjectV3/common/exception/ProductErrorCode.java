package ErpProject.ErpProjectV3.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ProductErrorCode implements ErrorCode{

    PRODUCT_NOT_FOUND("PRODUCT-001",HttpStatus.NOT_FOUND,"도서를 찾을 수 없습니다.");

    private final String code;
    private final HttpStatus httpStatus;
    private final String message;
}
