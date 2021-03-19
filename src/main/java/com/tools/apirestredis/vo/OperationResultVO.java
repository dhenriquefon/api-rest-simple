package com.tools.apirestredis.vo;
/**
 * Created by fdcosta on 11/30/17.
 */
public class OperationResultVO<T> {
    private String errorCode;
    private String message;
    private T detail;

    public OperationResultVO(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public OperationResultVO(String errorCode, String message, T detail) {
        this.errorCode = errorCode;
        this.message = message;
        this.detail = detail;
    }

    public OperationResultVO() {
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }
}

