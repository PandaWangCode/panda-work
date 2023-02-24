package com.panda.core.pojo.rsp;

import com.panda.core.pojo.enums.ErrorCode;
import lombok.Data;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Data
@Accessors(chain = true)
public class R<T> implements Serializable {

    private String code = ErrorCode.SUCCESS.getCode();
    private String message = ErrorCode.SUCCESS.getMessage();
    private T result;

    public static R<Boolean> ok() {
        return new R<Boolean>().setResult(true);
    }

    public static <T> R<T> ok(T result) {
        return new R<T>().setResult(result);
    }

    public static <T> R<T> fail(String code, T result) {
        return new R<T>().setCode(code).setResult(result);
    }

    public static <T> R<T> fail(String code, String message) {
        return new R<T>().setCode(code).setMessage(message);
    }

    public static <T> R<T> fail(ErrorCode errorCode) {
        return new R<T>().setCode(errorCode.getCode()).setMessage(errorCode.getMessage());
    }

    public static <T> R<T> fail(ErrorCode errorCode, String message) {
        return new R<T>().setCode(errorCode.getCode()).setMessage(message);
    }

}
