package com.mini.payment.permission.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class ValidateUtils {
    public static boolean isPassword(String pwd) {
        // all numeric is not secure password
        if (ValidateUtils.isInteger(pwd)) {
            return false;// all numeric
        } else {
            // all letter is not secure password
            if (ValidateUtils.isLettersOnly(pwd)) {
                return false; // all letter
            } else {

                if (ValidateUtils.isAlphanumeric(pwd)) {
                    // combination of numeric & letter
                    return true;
                } else {
                    // contains illegal character
                    return false;
                }
            }
        }
    }

    /**
     * alpha & numeric validate
     */
    public static boolean isAlphanumeric(String str) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
        return pattern.matcher(str).matches();
    }

    public static boolean isLettersOnly(String str) {
        Pattern pattern = Pattern.compile("^[A-Za-z]+$");
        return pattern.matcher(str).matches();
    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static boolean isDouble(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static boolean isDoubleAnd2Decimals(String str) {
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))([.](\\d){1,2})?$");
        return pattern.matcher(str).matches();
    }

    public static boolean isNumeric(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        } else {
            return str.matches("\\d*");
        }
    }

    public static boolean isEmail(String str) {
        Pattern pattern = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
        return pattern.matcher(str).matches();
    }

    public static boolean isChinese(String str) {
        Pattern pattern = Pattern.compile("[\u0391-\uFFE5]+$");
        return pattern.matcher(str).matches();
    }

    public static boolean isMobile(String mobile) {
        Pattern pattern = Pattern.compile("^1[3|4|5|7|8][0-9]{9}$");
        return StringUtils.isNoneBlank(mobile) && pattern.matcher(mobile).matches();
    }

    public static boolean isPhone(String phone) {
        Pattern pattern = Pattern.compile("^0[0-9]{2,3}[-|－][0-9]{7,8}([-|－][0-9]{1,4})?$");
        return pattern.matcher(phone).matches();
    }

    public static boolean isPostCode(String post) {
        Pattern pattern = Pattern.compile("^[0-9]{6}$");
        return pattern.matcher(post).matches();
    }

    /**
     * validate yyyy-MM-dd
     */
    public static boolean isDate(String dateStr) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = df.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return date != null;
    }

    /**
     * validate hh:mm:ss
     */
    public static boolean isTime(String timeStr) {
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
        Date date = null;
        try {
            date = df.parse(timeStr);
        } catch (ParseException e) {
            return false;
        }
        return date != null;
    }

    /**
     * validate date format
     * 1) yyyy-MM-dd hh:mm::ss
     * 2) yyyy-MM-dd hh:mm
     */
    public static boolean isDateTime(String dateTime) {
        int first = dateTime.indexOf(":");
        int last = dateTime.lastIndexOf(":");
        if (first == -1) {
            return false;
        }
        SimpleDateFormat df = null;
        if (first == last) {
            df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        } else {
            df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        }
        Date date = null;
        try {
            date = df.parse(dateTime);
        } catch (ParseException e) {
            return false;
        }
        return date == null;
    }


    public static boolean isPrime(int x) {
        if (x <= 7) {
            if (x == 2 || x == 3 || x == 5 || x == 7)
                return true;
        }
        int c = 7;
        if (x % 2 == 0)
            return false;
        if (x % 3 == 0)
            return false;
        if (x % 5 == 0)
            return false;
        int end = (int) Math.sqrt(x);
        while (c <= end) {
            if (x % c == 0) {
                return false;
            }
            c += 4;
            if (x % c == 0) {
                return false;
            }
            c += 2;
            if (x % c == 0) {
                return false;
            }
            c += 4;
            if (x % c == 0) {
                return false;
            }
            c += 2;
            if (x % c == 0) {
                return false;
            }
            c += 4;
            if (x % c == 0) {
                return false;
            }
            c += 6;
            if (x % c == 0) {
                return false;
            }
            c += 2;
            if (x % c == 0) {
                return false;
            }
            c += 6;
        }
        return true;
    }
}
