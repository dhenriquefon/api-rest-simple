package com.tools.apirestredis.vo;

import com.tools.apirestredis.config.OperationResult;

/**
 * Created by fdcosta on 11/30/17.
 */
public class MessageVO<T> {
    private OperationResultVO operationResult;
    private T data;

    public MessageVO(OperationResultVO operationResult, T data) {
        this.operationResult = operationResult;
        this.data = data;
    }

    public MessageVO(OperationResultVO operationResult) {
        this.operationResult = operationResult;
    }

    public MessageVO() {}

    public OperationResultVO getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(OperationResultVO operationResult) {
        this.operationResult = operationResult;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MessageVO<T> success(T data){
        OperationResultVO or = new OperationResultVO(OperationResult.OK.getErrorCode(), OperationResult.OK.getDescription());
        return new MessageVO(or, data);
    }
}
