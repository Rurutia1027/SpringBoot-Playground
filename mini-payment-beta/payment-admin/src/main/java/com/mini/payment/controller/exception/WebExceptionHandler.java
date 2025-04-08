package com.mini.payment.controller.exception;

import com.mini.payment.exception.BizException;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class WebExceptionHandler {
    private static final Log LOG = LogFactory.getLog(WebExceptionHandler.class);

    @ExceptionHandler({BizException.class})
    @ResponseStatus(HttpStatus.OK)
    public String processBizException(HttpServletRequest request, BizException e) {
        LOG.error("BizException", e);
        return e.getMsg();
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public String processException(HttpServletRequest request, Exception e) {
        LOG.error("Exception ", e);
        return e.getMessage();
    }
}
