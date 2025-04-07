package com.mini.payment.notify.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum NotifyStatusEnum {
    CREATED("notify record create successfully"),
    SUCCESS("notify success"),
    FAILED("notify fail"),
    HTTP_REQUEST_SUCCESS("http request response success"),
    HTTP_REQUEST_FAILED("http request response failed");

    private String desc;

    private NotifyStatusEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static Map<String, Map<String, Object>> toMap() {
        NotifyStatusEnum[] arr = NotifyStatusEnum.values();
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
        NotifyStatusEnum[] arr = NotifyStatusEnum.values();
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("desc", arr[i].getDesc());
            list.add(map);
        }
        return list;
    }

    public static NotifyStatusEnum getEnum(String name) {
        NotifyStatusEnum[] arr = NotifyStatusEnum.values();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name().equalsIgnoreCase(name)) {
                return arr[i];
            }
        }
        return null;
    }

    public static String getJsonStr() {
        NotifyStatusEnum[] enums = NotifyStatusEnum.values();
        StringBuffer jsonStr = new StringBuffer("[");
        for (NotifyStatusEnum item : enums) {
            if (!"[".equals(jsonStr.toString())) {
                jsonStr.append(",");
            }
            jsonStr.append("{id:'").append(item).append("',desc:'")
                    .append(item.getDesc()).append("'}");
        }
        jsonStr.append("]");
        return jsonStr.toString();
    }
}
