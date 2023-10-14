package org.rify.common.core.domain.entity;

import org.springframework.http.HttpStatus;

/**
 * @author : lucas
 * @version 1.0
 * @date : 2023/10/5下午7:36
 * @className : HttpResult
 * @description : Http 请求结果对象
 */
public record HttpResult(int statusCode, String message, HttpStatus.Series series, String body) {
    public HttpResult(HttpStatus httpStatus, String body) {
        this(httpStatus.value(), httpStatus.getReasonPhrase(), httpStatus.series(), body);
    }
}
