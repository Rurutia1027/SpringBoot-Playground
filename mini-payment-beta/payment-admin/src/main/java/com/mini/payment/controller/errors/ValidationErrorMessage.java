package com.mini.payment.controller.errors;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Map;

@JsonRootName("validationError")
@JsonPropertyOrder({"code", "message", "detail", "field"})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ValidationErrorMessage {
    private String code;
    private String field;
    private String message;
    private String detail;

    private Map<String, String> data;

    public ValidationErrorMessage(String code, String message) {
        this.code = code;
        this.message = message;
        this.detail = message;
    }

    public ValidationErrorMessage(String code, String message, String detail, String field) {
        this.code = code;
        this.message = message;
        this.detail = detail;
        this.field = field;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
