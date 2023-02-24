package com.panda.core.pojo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.io.Serializable;

/**
 * A：错误来源于用户
 * B：错误来源于系统
 * C：错误来源于第三方服务
 */
@Getter
@AllArgsConstructor
public enum ErrorCode implements Serializable {

    SUCCESS("00000", "OK"),
    CLIENT_ERROR("A0001", "用户端错误"),
    ;

    private final String code;
    private final String message;
}
