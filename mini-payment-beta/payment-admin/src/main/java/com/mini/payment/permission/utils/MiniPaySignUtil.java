package com.mini.payment.permission.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MiniPaySignUtil {
    private static final Log LOG = LogFactory.getLog(MiniPaySignUtil.class);

    private MiniPaySignUtil() {}

    public static String getSign(String token, long timeStamp, String userName) {
        String [] arr = new String[] {token, String.valueOf(timeStamp), userName};
        Arrays.sort(arr);
        StringBuilder content = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }
        MessageDigest md = null;
        String tmpStr = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            byte [] digest = md.digest(content.toString().getBytes(StandardCharsets.UTF_8));
            tmpStr = byteToStr(digest);
        } catch (NoSuchAlgorithmException e) {
            LOG.error(e);
        }
        return tmpStr;
    }
    private static String byteToStr(byte [] byteArray) {
        String strDigest = "";
        for (int i = 0; i < byteArray.length; i++) {
            strDigest += byteToHexStr(byteArray[i]);
        }
        return strDigest;
    }

    private static String byteToHexStr(byte mByte) {
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        char[] tmpArr = new char[2];

        tmpArr[0] = Digit[(mByte >>> 4) & 0X0F];
        tmpArr[1] = Digit[mByte & 0X0F];

        return new String(tmpArr);
    }
}
