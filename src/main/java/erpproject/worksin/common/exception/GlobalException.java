package erpproject.worksin.common.exception;

import erpproject.worksin.common.code.ErrorCode;
import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException{

    private final ErrorCode errorCode;

    public GlobalException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }


}
