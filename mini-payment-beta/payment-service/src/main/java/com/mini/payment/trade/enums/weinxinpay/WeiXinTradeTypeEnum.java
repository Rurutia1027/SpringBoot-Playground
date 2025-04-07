package com.mini.payment.trade.enums.weinxinpay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum WeiXinTradeTypeEnum {
    ;
    private String desc;

    private WeiXinTradeTypeEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static Map<String, Map<String, Object>> toMap() {
        WeiXinTradeTypeEnum[] arr = WeiXinTradeTypeEnum.values();
        Map<String, Map<String, Object>> enumMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Map<String, Object> map = new HashMap<>();
            String key = arr[i].name();
            map.put("desc", arr[i].getDesc());
            enumMap.put(key, map);
        }
        return enumMap;
    }

    public static List toList() {
        WeiXinTradeTypeEnum[] arr = WeiXinTradeTypeEnum.values();
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("desc", arr[i].getDesc());
            list.add(map);
        }
        return list;
    }

    public static WeiXinTradeTypeEnum getEnum(String name) {
        WeiXinTradeTypeEnum[] arr = WeiXinTradeTypeEnum.values();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name().equalsIgnoreCase(name)) {
                return arr[i];
            }
        }
        return null;
    }

    public static String getJsonStr() {
        WeiXinTradeTypeEnum[] enums = WeiXinTradeTypeEnum.values();
        StringBuffer jsonStr = new StringBuffer("[");
        for (WeiXinTradeTypeEnum item : enums) {
            if (!"[".equals(jsonStr.toString())) {
                jsonStr.append(",");
            }
            jsonStr.append("{id:'").append(item).append("',desc:'").append(item.getDesc()).append("'}");
        }
        jsonStr.append("]");
        return jsonStr.toString();
    }
}
