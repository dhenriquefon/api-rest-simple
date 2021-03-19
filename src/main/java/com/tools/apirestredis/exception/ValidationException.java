package com.tools.apirestredis.exception;

/**
 * Created by fdcosta on 12/6/17.
 */

public class ValidationException extends Exception {
    private final String code;
    private final String description;

    public ValidationException(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
