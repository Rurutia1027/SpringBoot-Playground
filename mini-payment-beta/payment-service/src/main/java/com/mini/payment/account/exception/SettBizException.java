package com.mini.payment.account.exception;

import com.mini.payment.exception.BizException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SettBizException extends BizException {
    private static final Log LOG = LogFactory.getLog(SettBizException.class);

    public static final SettBizException SETT_STATUS_ERROR = new SettBizException(10010001, "Invalid settlement status");

    public SettBizException(int code, String msgFormat, Object... args) {
        super(code, msgFormat, args);
    }

    public SettBizException() {
    }

    public SettBizException(String message, Throwable cause) {
        super(message, cause);
    }

    public SettBizException newInstance(String msgFormat, Object... args) {
        return new SettBizException(this.code, msgFormat, args);
    }

    public SettBizException print() {
        LOG.info("BizException, code:" + this.code + ", msg: " + this.msg);
        return this;
    }
}
