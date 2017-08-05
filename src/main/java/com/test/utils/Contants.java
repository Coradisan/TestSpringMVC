package com.test.utils;

/**
 * Created by Admin on 2017/8/4 0004.
 */
public enum Contants {
    Spring("S", "春天"),
    Summer("S", "夏天"),
    Autumn("A", "秋天"),
    Winter("W", "冬天");


    private String code;

    private String value;

    Contants(String code, String value) {
        this.code = code;
        this.value = value;
    }


}

enum TYPE {
    IOS,
    C,
    JAVA;
}

enum FlightType {
    OW("OW"),
    RT("RT"),
    OJ("OJ"),
    MT("MT");

    private String value;

    private FlightType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

enum Season {
    Spring("S", "春天"),
    Summer("S", "夏天"),
    Autumn("A", "秋天"),
    Winter("W", "冬天");


    private String code;

    private String name;

    Season(String code, String name) {
        this.code = code;
        this.name = name;
    }


    public static String getName(String code) {
        for (Season season : Season.values()) {
            if (season.getCode() == code) {
                return season.getName();
            }
        }
        return null;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class TTest {

    public static void main(String[] args) {
//        System.out.println(Season.getValue("s"));


        System.out.println(Season.values());

    }

}
